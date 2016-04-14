package com.example.weather.presentationmodel;

import android.os.Handler;
import android.os.Message;

import com.example.weather.MainActivity;
import com.example.weather.model.CurrentlyData;
import com.example.weather.model.DailyData;
import com.example.weather.model.HourlyData;
import com.example.weather.model.Status;
import com.example.weather.model.WeeklyData;
import com.example.weather.util.Util;
import com.google.gson.Gson;

import org.robobinding.annotation.ItemPresentationModel;
import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarkYoung on 16/4/14.
 */
@org.robobinding.annotation.PresentationModel
public class PresentationModel implements HasPresentationModelChangeSupport {

    private PresentationModelChangeSupport changeSupport;
    private MainActivity context;
    private String jsondata;
    private Status status;
    private CurrentlyData currentlyData;
    private HourlyData hourlyData;
    private List<CurrentlyData> dataList;
    private WeeklyData weeeklyData;
    private List<DailyData> dailyDataList;
    private boolean flagNow = true;
    private boolean flagHourly = false;
    private boolean flagWeekly = false;

    public PresentationModel(MainActivity context) {
        changeSupport = new PresentationModelChangeSupport(this);
        this.context = context;
        status = new Status();
        currentlyData = new CurrentlyData();
        status.setCurrently(currentlyData);
        hourlyData = new HourlyData();
        dataList= new ArrayList<CurrentlyData>();
        for(int i=0;i<48;i++){
            CurrentlyData data = new CurrentlyData();
            dataList.add(data);
        }
        hourlyData.setData(dataList);
        status.setHourly(hourlyData);

        weeeklyData= new WeeklyData();
        dailyDataList = new ArrayList<DailyData>();
        for(int i=0;i<7;i++){
            DailyData dailyData = new DailyData();
            dailyDataList.add(dailyData);
        }
        weeeklyData.setData(dailyDataList);
        status.setDaily(weeeklyData);
    }

    public void showNow(){
        changeSupport.firePropertyChange("nowProperty");
    }

    public int getNowProperty(){
        if(flagNow == false){
            flagNow = true;
            return 0;
        }else{
            flagNow = false;
            return 2;
        }
    }

    public void showHourlyData(){
        changeSupport.firePropertyChange("hourlyProperty");
    }

    public int getHourlyProperty(){
        if(flagHourly == false){
            flagHourly = true;
            return 0;
        }else{
            flagHourly = false;
            return 2;
        }
    }

    public void showNexSevenDays(){
        changeSupport.firePropertyChange("weeklyProperty");
    }

    public int getWeeklyProperty(){
        if(flagWeekly == false){
            flagWeekly = true;
            return 0;
        }else{
            flagWeekly = false;
            return 2;
        }
    }

    public String getUpdateTime(){
        return Util.unix2human(status.getCurrently().getTime())+"("+status.getTimezone()+")";
    }

    public String getSummary(){
        return status.getCurrently().getSummary();
    }

    public String getTemperature(){
        double t = (status.getCurrently().getTemperature()-32)/1.8;
        return (float)(Math.round((t*100)/100))+"C";
    }

    public String getWindSpeed(){
        double s = status.getCurrently().getWindSpeed()*0.3048;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return  decimalFormat.format(s)+"km/h";
    }

    public String getPrecipType(){
        return status.getCurrently().getPrecipType();
    }

    public String getPrecipProbability(){
        return status.getCurrently().getPrecipProbability()*100+"%";
    }

    public String getPrecipIndensity(){
        float p = status.getCurrently().getPrecipIntesity();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(p);
    }

    public String getCloudCover(){
        return status.getCurrently().getCloudCover()*100+"%";
    }

    public String getPressure(){
        float pressure = status.getCurrently().getPressure();
        DecimalFormat decimalFormat = new DecimalFormat("0000.00");
        return decimalFormat.format(pressure)+"hPa";
    }

    public String getOzone(){
        float ozone = status.getCurrently().getOzone();
        DecimalFormat decimalFormat = new DecimalFormat("000.00");
        return decimalFormat.format(ozone);
    }

    public String getSummaryNextFortyEightHours(){
        return status.getHourly().getSummary();
    }

    public String getPrecipTypeHourly(){
        return status.getHourly().getData().get(0).getPrecipType()+"%";
    }

    @ItemPresentationModel(DataItemPresentationModel.class)
    public List<CurrentlyData> getDatum(){
        return status.getHourly().getData();
    }



    public String getSummaryNextWeek(){
        return status.getDaily().getSummary();
    }

    @ItemPresentationModel(DailyDataItemPresentationModel.class)
    public List<DailyData> getDailyDatum(){
        return status.getDaily().getData();
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return changeSupport;
    }

    public void httpRequest(String url){
        changeSupport.firePropertyChange("hello");
        myRequest(url);
    }

    public void myRequest(final String url){

        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection;
                InputStream is = null;

                try {
                    connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("GET");
                    is = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line;
                    StringBuilder sb = new StringBuilder();
                    while((line = reader.readLine())!=null){
                        sb.append(line);
                    }
                    jsondata = sb.toString();
                    Gson gson = new Gson();
                    status = gson.fromJson(jsondata,Status.class);
                    Handler handler = context.getHandler();
                    if(handler!=null){
                        Message msg = handler.obtainMessage();
                        msg.what = 0x01;
                        handler.sendMessage(msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
