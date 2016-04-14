package com.example.weather.util;

import java.text.SimpleDateFormat;

/**
 * Created by MarkYoung on 16/4/14.
 */
public class Util {

    public static String unix2human(long TimeStamp)   {
        //unix时间戳转成Y-m-d H:i:s格式的日期
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(TimeStamp*1000);
    }

    public static String unix2human4hourly(long TimeStamp)   {
        //unix时间戳转成Y-m-d H:i:s格式的日期
        SimpleDateFormat sdf = new SimpleDateFormat("H");
        return sdf.format(TimeStamp*1000);
    }

    public static String unix2human4daily(long TimeStamp)   {
        //unix时间戳转成Y-m-d H:i:s格式的日期
        SimpleDateFormat sdf = new SimpleDateFormat("M-d");
        return sdf.format(TimeStamp*1000);
    }

    public static String unix2human4dailytime(long TimeStamp)   {
        //unix时间戳转成Y-m-d H:i:s格式的日期
        SimpleDateFormat sdf = new SimpleDateFormat("H:m");
        return sdf.format(TimeStamp*1000);
    }

}
