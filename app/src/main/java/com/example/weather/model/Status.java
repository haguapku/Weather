package com.example.weather.model;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class Status {

    private String timezone;
    private int offset;
    private CurrentlyData currently;
    private HourlyData hourly;
    private WeeklyData daily;

    @Override
    public String toString() {
        return timezone+"-"+offset+"-"+currently;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public CurrentlyData getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentlyData currently) {
        this.currently = currently;
    }

    public HourlyData getHourly() {
        return hourly;
    }

    public void setHourly(HourlyData hourly) {
        this.hourly = hourly;
    }

    public WeeklyData getDaily() {
        return daily;
    }

    public void setDaily(WeeklyData daily) {
        this.daily = daily;
    }
}
