package com.example.weather.model;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class DailyData {

    private long time;
    private String summary;
    private String icon;
    private long sunriseTime;
    private long sunsetTime;
    private float moonPhase;
    private float precipIntesity;
    private float precipProbability;
    private String precipType;
    private float temperatureMin;
    private long temperatureMinTime;
    private float temperatureMax;
    private long temperatureMaxTime;
    private float apprentTemperatureMin;
    private long apprentTemperatureMinTime;
    private float apprentTemperatureMax;
    private long apprentTemperatureMaxTime;
    private float dewPoint;
    private float humidity;
    private float windSpeed;
    private int windBearing;
    private float cloudCover;
    private float pressure;
    private float ozone;

    public DailyData() {
    }

    public DailyData(long time, String summary, String icon, long sunriseTime, long sunsetTime,
                     float moonPhase, float precipIntesity, float precipProbability, String precipType,
                     float temperatureMin, long temperatureMinTime, float temperatureMax,
                     long temperatureMaxTime, float apprentTemperatureMin, long apprentTemperatureMinTime,
                     float apprentTemperatureMax, long apprentTemperatureMaxTime, float dewPoint, float humidity,
                     float windSpeed, int windBearing, float cloudCover, float pressure, float ozone) {
        this.time = time;
        this.summary = summary;
        this.icon = icon;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.moonPhase = moonPhase;
        this.precipIntesity = precipIntesity;
        this.precipProbability = precipProbability;
        this.precipType = precipType;
        this.temperatureMin = temperatureMin;
        this.temperatureMinTime = temperatureMinTime;
        this.temperatureMax = temperatureMax;
        this.temperatureMaxTime = temperatureMaxTime;
        this.apprentTemperatureMin = apprentTemperatureMin;
        this.apprentTemperatureMinTime = apprentTemperatureMinTime;
        this.apprentTemperatureMax = apprentTemperatureMax;
        this.apprentTemperatureMaxTime = apprentTemperatureMaxTime;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.pressure = pressure;
        this.ozone = ozone;
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

    public long getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(long sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public long getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(long sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public float getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(float moonPhase) {
        this.moonPhase = moonPhase;
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

    public float getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public long getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(long temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public float getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public long getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(long temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public float getApprentTemperatureMin() {
        return apprentTemperatureMin;
    }

    public void setApprentTemperatureMin(float apprentTemperatureMin) {
        this.apprentTemperatureMin = apprentTemperatureMin;
    }

    public long getApprentTemperatureMinTime() {
        return apprentTemperatureMinTime;
    }

    public void setApprentTemperatureMinTime(long apprentTemperatureMinTime) {
        this.apprentTemperatureMinTime = apprentTemperatureMinTime;
    }

    public float getApprentTemperatureMax() {
        return apprentTemperatureMax;
    }

    public void setApprentTemperatureMax(float apprentTemperatureMax) {
        this.apprentTemperatureMax = apprentTemperatureMax;
    }

    public long getApprentTemperatureMaxTime() {
        return apprentTemperatureMaxTime;
    }

    public void setApprentTemperatureMaxTime(long apprentTemperatureMaxTime) {
        this.apprentTemperatureMaxTime = apprentTemperatureMaxTime;
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
