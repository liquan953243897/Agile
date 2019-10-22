package com.pgz.agile.http;

import com.pgz.agile.http.bean.ResponseMessage;
import com.pgz.agile.vo.Reception;
import com.pgz.agile.vo.StatusVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * http请求接口
 *
 * @author liquan@syxysoft.com
 * @date 2019-10-22
 */
public interface Api {

    /**
     * 登录接口
     *
     * @param username 用户名
     * @param password 密码
     * @return
     * @author liquan@syxysoft.com
     * date 2019/10/22
     **/
    @GET("/login")
    Call<ResponseMessage> login(@Field("username") String username, @Field("password") int password);

    /**
     * post请求
     *
     * @param statusVO
     * @return
     * @author liquan@syxysoft.com
     * date 2019/10/22
     **/
    @POST("/remote/api/v1/rollback")
    Call<ResponseMessage<String>> rollback(@Body StatusVO statusVO);

    // @GET注解的作用:采用Get方法发送网络请求
    // getCall() = 接收网络请求数据的方法
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>
    @GET("/api/v1/token/api001/123456")
    Call<ResponseMessage<Reception>> getCall();
}
