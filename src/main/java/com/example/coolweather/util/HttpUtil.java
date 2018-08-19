package com.example.coolweather.util;


import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 类说明：访问网络数据的工具
 * 作者：TangFengting
 * 时间：2018/8/19：16:14
 */

public class HttpUtil {


    /**
     * 以OkHttp方式发送网络请求
     * @param address   访问网络的url地址
     * @param callback    请求网络的回调函数
     */
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
