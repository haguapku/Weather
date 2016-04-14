package com.example.weather.presentationmodel;

import com.example.weather.model.CurrentlyData;
import com.example.weather.util.Util;

import org.robobinding.itempresentationmodel.ItemContext;
import org.robobinding.itempresentationmodel.ItemPresentationModel;

import java.text.DecimalFormat;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class DataItemPresentationModel implements ItemPresentationModel<CurrentlyData> {

    private CurrentlyData value;

    @Override
    public void updateData(CurrentlyData currentlyData, ItemContext itemContext) {
        value = currentlyData;
    }

    public void setValue(CurrentlyData currentlyData){
        value = currentlyData;
    }

    public String getTimeHourly(){
        return Util.unix2human4hourly(value.getTime());
    }

    public String getIconHourly(){
        return value.getIcon();
    }

    public String getSummaryHourly() {
        return value.getSummary();
    }

    public String getTemperatureHourly(){
        double t = (value.getTemperature()-32)/1.8;
        return Math.round(t)+"";
    }

    public String getPrecipProbabilityHourly(){
        return value.getPrecipProbability()*100+"";
    }

    public String getWindSpeedHourly(){
        double s = value.getWindSpeed()*0.3048;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(s)+"km/h";
    }
}
