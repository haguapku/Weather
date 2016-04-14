package com.example.weather;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.weather.presentationmodel.PresentationModel;

import org.robobinding.binder.BinderFactory;
import org.robobinding.binder.BinderFactoryBuilder;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;
import org.robobinding.ViewBinder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    PresentationModelChangeSupport changeSupport;
    LocationManager locationManager;
    String locationProvider;
    double latitude, longitude;
    private Handler getWeatherHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Based on Robobinding for MVVM

        PresentationModel presentationModel = new PresentationModel(MainActivity.this);
        changeSupport = presentationModel.getPresentationModelChangeSupport();
        ViewBinder viewBinder = createViewBinder();
        View rootView = viewBinder.inflateAndBind(R.layout.activity_main, presentationModel);
        setContentView(rootView);

        getWeatherHandler = new Handler() {

            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                changeSupport.firePropertyChange("summary");
                changeSupport.firePropertyChange("temperature");
                changeSupport.firePropertyChange("updateTime");
                changeSupport.firePropertyChange("windSpeed");
                changeSupport.firePropertyChange("precipType");
                changeSupport.firePropertyChange("precipProbability");
                changeSupport.firePropertyChange("precipIndensity");
                changeSupport.firePropertyChange("cloudCover");
                changeSupport.firePropertyChange("pressure");
                changeSupport.firePropertyChange("ozone");
                changeSupport.firePropertyChange("summaryNextFortyEightHours");
                changeSupport.firePropertyChange("datum");
                changeSupport.firePropertyChange("precipTypeHourly");
                changeSupport.firePropertyChange("nowProperty");
                changeSupport.firePropertyChange("hourlyProperty");
                changeSupport.firePropertyChange("summaryNextWeek");
                changeSupport.firePropertyChange("dailyDatum");
                changeSupport.firePropertyChange("weeklyProperty");
            }
        };

        locationManager= (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        List<String> providers = locationManager.getProviders(true);
        if(providers.contains(LocationManager.GPS_PROVIDER)){
            //GPS
            locationProvider = LocationManager.GPS_PROVIDER;
        }else if(providers.contains(LocationManager.NETWORK_PROVIDER)){
            //Network
            locationProvider = LocationManager.NETWORK_PROVIDER;
        }else{
            Toast.makeText(this, "No available provider", Toast.LENGTH_SHORT).show();
            return ;
        }
        @SuppressWarnings("ResourceType")
        Location location = locationManager.getLastKnownLocation(locationProvider);

        latitude = location.getLatitude();
        longitude = location.getLongitude();

        String realUrl = "https://api.forecast.io/forecast/01dbdc2e173b40394ba455acab0eb62d/"+latitude+","+ longitude;

        presentationModel.myRequest(realUrl);

    }

    private ViewBinder createViewBinder() {
        BinderFactory reusableBinderFactory = new BinderFactoryBuilder().build();
        return reusableBinderFactory.createViewBinder(this);
    }

    public Handler getHandler() {
        return getWeatherHandler;
    }
}
