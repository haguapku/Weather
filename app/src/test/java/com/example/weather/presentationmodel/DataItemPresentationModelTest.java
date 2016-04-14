package com.example.weather.presentationmodel;

import com.example.weather.TestData;
import com.example.weather.model.CurrentlyData;

import junit.framework.TestCase;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class DataItemPresentationModelTest extends TestCase {

    private CurrentlyData value;
    private DataItemPresentationModel dataItem;

    public void setUp() throws Exception {
        super.setUp();
        this.value = TestData.getCurrentlyData();
        dataItem = new DataItemPresentationModel();
        dataItem.setValue(value);
    }

    public void tearDown() throws Exception {

    }

    public void testGetTimeHourly() throws Exception {
        assertEquals("13",dataItem.getTimeHourly());
    }

    public void testGetIconHourly() throws Exception {
        assertEquals("Clear",dataItem.getIconHourly());
    }

    public void testGetSummaryHourly() throws Exception {
        assertEquals("Clear-day",dataItem.getSummaryHourly());
    }

    public void testGetTemperatureHourly() throws Exception {
        assertEquals("21",dataItem.getTemperatureHourly());
    }

    public void testGetPrecipProbabilityHourly() throws Exception {
        assertEquals("31.0",dataItem.getPrecipProbabilityHourly());
    }

    public void testGetWindSpeedHourly() throws Exception {
        assertEquals("2.36km/h",dataItem.getWindSpeedHourly());
    }
}