package com.prabhat.android.architecturecomponentsexample.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.prabhat.android.architecturecomponentsexample.Model.CityList;
import com.prabhat.android.architecturecomponentsexample.repository.CityListRepository;

import java.util.List;

/**
 * Created by Android on 2/28/2018.
 */

public class CityViewModel extends ViewModel {

    private LiveData<List<CityList>> liveData;
    private CityListRepository cityListRepository;

    public CityViewModel() {

        cityListRepository = new CityListRepository();

    }

    public void init() {

        if (liveData != null) {
            return;
        }
        liveData = cityListRepository.getCityList();
    }

    public LiveData<List<CityList>> getCityList() {
        return this.liveData;
    }
}

