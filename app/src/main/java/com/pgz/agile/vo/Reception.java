package com.pgz.agile.vo;

/**
 * 一个类
 *
 * @author liquan@syxysoft.com
 * @date 2019-10-21
 */
public class Reception {

    /**
     * token
     */
    private String token;
    /**
     * 有效时长
     */
    private int expiresIn;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
