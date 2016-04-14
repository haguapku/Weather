package com.example.weather.presentationmodel;

import com.example.weather.model.DailyData;
import com.example.weather.util.Util;

import org.robobinding.itempresentationmodel.ItemContext;
import org.robobinding.itempresentationmodel.ItemPresentationModel;

import java.text.DecimalFormat;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class DailyDataItemPresentationModel implements ItemPresentationModel<DailyData> {

    private DailyData value;

    @Override
    public void updateData(DailyData dailyData, ItemContext itemContext) {
        value = dailyData;
    }

    public void setValue(DailyData dailyData){
        value = dailyData;
    }

    public String getMaxTemp(){
        double t = (value.getTemperatureMax()-32)/1.8;
        return Math.round(t)+"";
    }

    public String getMinTemp(){
        double t = (value.getTemperatureMin()-32)/1.8;
        return Math.round(t)+"";
    }

    public String getDate(){
        return Util.unix2human4daily(value.getTime());
    }

    public String getIcon(){
        return value.getIcon();
    }

    public String getSummary(){
        return value.getSummary();
    }

    public String getSunrise(){
        return Util.unix2human4dailytime(value.getSunriseTime());
    }

    public String getSunset(){
        return Util.unix2human4dailytime(value.getSunsetTime());
    }

    public String getPrecipType(){
        return value.getPrecipType();
    }

    public String getPrecipProbability(){
        return value.getPrecipProbability()*100+"%";
    }

    public String getIntensity(){
        float i = value.getPrecipIntesity();
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        return decimalFormat.format(i);
    }

    public String getHumidity(){
        return value.getHumidity()*100+"";
    }

    public String getPressure(){
        float pressure = value.getPressure();
        DecimalFormat decimalFormat = new DecimalFormat("0000.00");
        return decimalFormat.format(pressure)+"hPa";
    }

    public String getWindSpeed(){
        double w = value.getWindSpeed()*0.3048;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(w)+"km/h";
    }

    public String getWindBearing(){
        return value.getWindBearing()+"";
    }
}
