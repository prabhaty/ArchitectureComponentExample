package com.prabhat.android.architecturecomponentsexample;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.prabhat.android.architecturecomponentsexample.Model.CityList;
import com.prabhat.android.architecturecomponentsexample.adapter.CityListAdatper;
import com.prabhat.android.architecturecomponentsexample.viewmodel.CityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView rv_citylist;
    CityListAdatper cityListAdatper;
    List<CityList> cityList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init() {

        rv_citylist = (RecyclerView) findViewById(R.id.rv_citylist);
        rv_citylist.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        cityList = new ArrayList<>();
        cityListAdatper = new CityListAdatper(MainActivity.this, cityList);
        rv_citylist.setAdapter(cityListAdatper);

        CityViewModel cityViewModel = new CityViewModel();
        cityViewModel.init();

        subscribeUi(cityViewModel);

    }

    private void subscribeUi(CityViewModel cityViewModel) {

        cityViewModel.getCityList().observe(this, new Observer<List<CityList>>() {
            @Override
            public void onChanged(@Nullable List<CityList> cityResponses) {

                cityList.addAll(cityResponses);
                cityListAdatper.notifyDataSetChanged();
                Log.e("RES", cityResponses.toString());
            }
        });


    }
}
