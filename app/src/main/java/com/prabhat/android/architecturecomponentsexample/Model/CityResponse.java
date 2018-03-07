package com.prabhat.android.architecturecomponentsexample.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Android on 2/28/2018.
 */

public class CityResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<CityList> cityList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CityList> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityList> cityList) {
        this.cityList = cityList;
    }
}
