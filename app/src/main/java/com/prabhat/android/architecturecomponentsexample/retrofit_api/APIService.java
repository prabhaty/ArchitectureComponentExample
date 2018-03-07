package com.prabhat.android.architecturecomponentsexample.retrofit_api;

import com.prabhat.android.architecturecomponentsexample.Model.CityResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Android on 2/28/2018.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("showStateCity")
    Call<CityResponse> getCityList(@Field("state_name") String state_name);

}
