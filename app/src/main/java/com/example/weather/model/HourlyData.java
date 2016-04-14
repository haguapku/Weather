package com.example.weather.model;

import java.util.List;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class HourlyData {

    private String summary;
    private String icon;
    private List<CurrentlyData> data;

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

    public List<CurrentlyData> getData() {
        return data;
    }

    public void setData(List<CurrentlyData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HourlyData{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
