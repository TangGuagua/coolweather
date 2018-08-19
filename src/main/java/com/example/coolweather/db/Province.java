package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 类说明：省级的数据库
 * 作者：TangFengting
 * 时间：2018/8/19：16:00
 */

public class Province extends DataSupport {

    //省级id值
    private int id;

    //省级名字
    private String provinceName;

    //省级代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
