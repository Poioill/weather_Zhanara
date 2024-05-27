package com.example.weather_zhanara.remote_data;

import com.example.weather_zhanara.models.Model;
import com.example.weather_zhanara.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface WeatherApi {
    String URL_KEY = "6cb4c579ec8f31bd7b1d2499cd7fb2d1";

    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key
    );

    @GET("/data/2.5/weather?q=London&appid=6cb4c579ec8f31bd7b1d2499cd7fb2d1")
    Call<WeatherModel> getWeather(
            @Query("q") String name,
            @Query("appid") String key);


}


