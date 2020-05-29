package com.anri.weight.contr.app.weightcontrspbootapp.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoYW5yaUBnbWFpbC5jb20iLCJleHAiOjE1ODU4NDAwNTcsImlhdCI6MTU4NTIzNTI1N30.O584qoQnCShDdU0LXTyTxgkV-rlqDge7_c8LmTJYUyI9aWAV8jfUOpOQLfPrNNJKBeblcaleBXkOe_ZvTJNjNg"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
