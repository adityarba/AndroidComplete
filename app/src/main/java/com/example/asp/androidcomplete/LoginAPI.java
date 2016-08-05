package com.example.asp.androidcomplete;

import com.google.gson.JsonObject; // use this package if you want to send the actually needed json data to the server i.e. {"name":"xyz","pass":"123"}

import org.json.JSONObject; // if this package is used i.e.(if u user 'JSONObject'), then your abject will be sent as {"nameValuePairs":{"name":"xyz","pass":"123"}}, so don't use it

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by Rba_dkp7 on 7/19/2016.
 */
public interface LoginAPI {

    @POST("/login_check")
    public void loginCheck(@Body JsonObject obj, Callback<JsonObject> callback);
}
