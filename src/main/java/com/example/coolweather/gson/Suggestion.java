package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 类说明：HeWeahther的Suggestion实体类
 * 作者：TangFengting
 * 时间：2018/8/19：19:30
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
