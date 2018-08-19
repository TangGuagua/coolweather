package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 类说明：HeWeahther的Now实体类
 * 作者：TangFengting
 * 时间：2018/8/19：19:26
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
