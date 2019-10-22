package com.pgz.agile.http;

import com.pgz.agile.http.constant.ApiConfig;
import com.pgz.agile.http.interceptor.LoginInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * http请求工具类
 *
 * @author liquan@syxysoft.com
 * @date 2019-10-22
 */
public class HttpUtils {

    /**
     * 超时时间
     */
    private static final Integer DEFAULT_TIMEOUT = 30000;

    /**
     * 生成实例
     *
     * @return
     * @author liquan@syxysoft.com
     * date 2019/10/22
     **/
    public static Api api() {
        //初始化一个OkHttpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);

        builder.addInterceptor(new LoginInterceptor());
        OkHttpClient okHttpClient = builder.build();
        Retrofit retrofit = new Retrofit.Builder()
                //设置网络请求的Url地址
                .baseUrl(ApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //设置数据解析器
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient).build();
        return retrofit.create(Api.class);
    }

    /**
     * 同步api请求
     *
     * @return
     * @author liquan@syxysoft.com
     * date 2019/10/22
     **/
    public static Api apiSync() {
        Retrofit retrofit = new Retrofit.Builder()
                //设置网络请求的Url地址
                .baseUrl(ApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //设置数据解析器
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        return retrofit.create(Api.class);
    }
}
