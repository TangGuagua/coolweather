package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 类说明：HeWeahther的Basic实体类
 * 作者：TangFengting
 * 时间：2018/8/19：18:19
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
