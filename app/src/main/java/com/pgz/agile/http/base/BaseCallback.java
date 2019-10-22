package com.pgz.agile.http.base;

import com.pgz.agile.http.bean.ResponseMessage;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseCallback<T> implements Callback<ResponseMessage<T>> {
    @Override
    public void onResponse(Call<ResponseMessage<T>> call, Response<ResponseMessage<T>> response) {
        String respCode = response.body().getRespCode();
        System.out.println(respCode);
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
