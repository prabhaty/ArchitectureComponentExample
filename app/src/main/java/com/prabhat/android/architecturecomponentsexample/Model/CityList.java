package com.prabhat.android.architecturecomponentsexample.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android on 2/28/2018.
 */

public class CityList {

    @SerializedName("id")
    private String id;

    @SerializedName("city_name")
    private String city_name;

    @SerializedName("city_state")
    private String city_state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_state() {
        return city_state;
    }

    public void setCity_state(String city_state) {
        this.city_state = city_state;
    }
}
