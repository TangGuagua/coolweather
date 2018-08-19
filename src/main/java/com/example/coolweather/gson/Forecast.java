package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 类说明：HeWeahther的Forecast实体类
 * 作者：TangFengting
 * 时间：2018/8/19：19:33
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
