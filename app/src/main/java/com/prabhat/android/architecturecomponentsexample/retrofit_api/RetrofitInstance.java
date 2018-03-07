package com.prabhat.android.architecturecomponentsexample.retrofit_api;

import com.prabhat.android.architecturecomponentsexample.constants.WebApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Android on 2/28/2018.
 */

public class RetrofitInstance {


    public static APIService getRetrofitInstance() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl(WebApi.BASEURL)
                .build().create(APIService.class);
    }
}
