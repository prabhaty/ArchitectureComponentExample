package com.prabhat.android.architecturecomponentsexample.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.prabhat.android.architecturecomponentsexample.Model.CityList;
import com.prabhat.android.architecturecomponentsexample.Model.CityResponse;
import com.prabhat.android.architecturecomponentsexample.retrofit_api.APIService;
import com.prabhat.android.architecturecomponentsexample.retrofit_api.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Android on 2/28/2018.
 */

public class CityListRepository {

    APIService apiService;
    String state_name = "Madhya pradesh";

    public CityListRepository() {

        apiService = RetrofitInstance.getRetrofitInstance();
    }

    public LiveData<List<CityList>> getCityList() {

        final MutableLiveData<List<CityList>> data = new MutableLiveData<>();

        Call<CityResponse> call = apiService.getCityList(state_name);
        call.enqueue(new Callback<CityResponse>() {
            @Override
            public void onResponse(Call<CityResponse> call, Response<CityResponse> response) {

                if (response.isSuccessful()){
                    data.setValue(response.body().getCityList());
                }
            }

            @Override
            public void onFailure(Call<CityResponse> call, Throwable t) {

            }
        });

        return data;
    }

}
