package com.example.weather;

import com.example.weather.model.CurrentlyData;
import com.example.weather.model.DailyData;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class TestData {

    public static CurrentlyData getCurrentlyData(){
        return new CurrentlyData(1460432073,"Clear-day","Clear",0.0065f,0.31f,
                "rain",70.46f,70.46f,56.85f,0.62f,7.73f,143,0.12f,1021.56f,273.68f);
    }

    public static DailyData getDailyData(){
        return new DailyData(1460988000,"Drizzle until afternoon.","rain",1461010930,
                1461050978,0.41f,0.0045f,0.23f,"rain",60.48f,1461009600,75.85f,
                1461034800,60.48f,1461009600,75.85f,1461034800,58.65f,0.79f,
                3.25f,182,0,1016.82f,263.3f);
    }
}
