package com.example.weather.presentationmodel;

import com.example.weather.TestData;
import com.example.weather.model.DailyData;

import junit.framework.TestCase;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class DailyDataItemPresentationModelTest extends TestCase {

    private DailyData dailyData;
    private DailyDataItemPresentationModel dailyDataItem;

    public void setUp() throws Exception {
        super.setUp();
        dailyData = TestData.getDailyData();
        dailyDataItem = new DailyDataItemPresentationModel();
        dailyDataItem.setValue(dailyData);
    }


    public void testGetMaxTemp() throws Exception {
        assertEquals("24", dailyDataItem.getMaxTemp());
    }

    public void testGetMinTemp() throws Exception {
        assertEquals("16",dailyDataItem.getMinTemp());
    }

    public void testGetDate() throws Exception {
        assertEquals("4-19",dailyDataItem.getDate());
    }

    public void testGetIcon() throws Exception {
        assertEquals("rain",dailyDataItem.getIcon());
    }

    public void testGetSummary() throws Exception {
        assertEquals("Drizzle until afternoon.",dailyDataItem.getSummary());
    }

    public void testGetSunrise() throws Exception {
        assertEquals("6:22",dailyDataItem.getSunrise());
    }

    public void testGetSunset() throws Exception {
        assertEquals("17:29",dailyDataItem.getSunset());
    }

    public void testGetPrecipType() throws Exception {
        assertEquals("rain",dailyDataItem.getPrecipType());
    }

    public void testGetPrecipProbability() throws Exception {
        assertEquals("23.0%",dailyDataItem.getPrecipProbability());
    }

    public void testGetIntensity() throws Exception {
        assertEquals("0.0045",dailyDataItem.getIntensity());
    }

    public void testGetHumidity() throws Exception {
        assertEquals("79.0",dailyDataItem.getHumidity());
    }

    public void testGetPressure() throws Exception {
        assertEquals("1016.82hPa",dailyDataItem.getPressure());
    }

    public void testGetWindSpeed() throws Exception {
        assertEquals("0.99km/h",dailyDataItem.getWindSpeed());
    }

    public void testGetWindBearing() throws Exception {
        assertEquals("182",dailyDataItem.getWindBearing());
    }
}