package com.aryan.instagram;

import com.aryan.instagram.models.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {

    @POST("instagram/users/register")
    Call<Void> register(@Body UserModel user);

    @POST("instagram/users/login")
    Call<Void> login(@Body UserModel user);

    
}
