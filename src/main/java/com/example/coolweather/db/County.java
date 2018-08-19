package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 类说明：县级的数据库
 * 作者：TangFengting
 * 时间：2018/8/19：16:08
 */

public class County extends DataSupport {

    //县级id值
    private int id;

    //县级名字
    private String countyName;

    //县级天气id
    private String weatherId;

    //县级所在市区的市级id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
