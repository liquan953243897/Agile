package com.pgz.agile.http;

import com.pgz.agile.http.base.BaseCallback;
import com.pgz.agile.http.bean.ResponseMessage;
import com.pgz.agile.vo.Reception;
import com.pgz.agile.vo.StatusVO;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 处理请求的类
 *
 * @author liquan@syxysoft.com
 * @date 2019-10-21
 */
public class DealRequest {

    public static void main(String[] args) {
        //对 发送请求 进行封装
        HttpUtils.api().getCall().enqueue(new BaseCallback<Reception>(){
            @Override
            public void onResponse(Call<ResponseMessage<Reception>> call, Response<ResponseMessage<Reception>> response) {
                super.onResponse(call, response);
            }

        });

        StatusVO statusVO = new StatusVO();
        statusVO.setRemark("121");
        statusVO.setStatus(1);
        statusVO.setWorkOrderId("21123");

        HttpUtils.api().rollback(statusVO).enqueue(new BaseCallback<>());


        //同步请求
        try {
            Response<ResponseMessage<Reception>> response = HttpUtils.api().getCall().execute();
            ResponseMessage body = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
