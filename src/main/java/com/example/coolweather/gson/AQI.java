package com.example.coolweather.gson;

/**
 * 类说明：HeWeahther的AQI实体类
 * 作者：TangFengting
 * 时间：2018/8/19：18:21
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
