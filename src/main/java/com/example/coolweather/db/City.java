package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 类说明：市级的数据库
 * 作者：TangFengting
 * 时间：2018/8/19：16:02
 */

public class City extends DataSupport {

    //城市id值
    private int id;

    //城市名字
    private String cityName;

    //城市代号
    private int cityCode;

    //城市所在省的省id值
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
