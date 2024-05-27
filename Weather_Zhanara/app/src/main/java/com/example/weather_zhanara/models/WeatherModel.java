package com.example.weather_zhanara.models;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("icon")
    String icon;
    @SerializedName("cod")
    String cod;
}
