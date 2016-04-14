package com.example.weather.model;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class CurrentlyData {

    private long time;
    private String summary;
    private String icon;
    private float precipIntesity;
    private float precipProbability;
    private String precipType;
    private float temperature;
    private float apprentTemperature;
    private float dewPoint;
    private float humidity;
    private float windSpeed;
    private int windBearing;
    private float cloudCover;
    private float pressure;
    private float ozone;

    public CurrentlyData() {
    }

    public CurrentlyData(long time, String summary, String icon, float precipIntesity, float precipProbability, String precipType, float temperature, float apprentTemperature, float dewPoint, float humidity, float windSpeed, int windBearing, float cloudCover, float pressure, float ozone) {
        this.time = time;
        this.summary = summary;
        this.icon = icon;
        this.precipIntesity = precipIntesity;
        this.precipProbability = precipProbability;
        this.precipType = precipType;
        this.temperature = temperature;
        this.apprentTemperature = apprentTemperature;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.pressure = pressure;
        this.ozone = ozone;
    }

    @Override
    public String toString() {
        return time+"-"+summary+"-"+ozone;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public float getPrecipIntesity() {
        return precipIntesity;
    }

    public void setPrecipIntesity(float precipIntesity) {
        this.precipIntesity = precipIntesity;
    }

    public float getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(float precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getApprentTemperature() {
        return apprentTemperature;
    }

    public void setApprentTemperature(float apprentTemperature) {
        this.apprentTemperature = apprentTemperature;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public float getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(float cloudCover) {
        this.cloudCover = cloudCover;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getOzone() {
        return ozone;
    }

    public void setOzone(float ozone) {
        this.ozone = ozone;
    }
}
