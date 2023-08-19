package com.rimapps.citymap.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rimapps.citymap.data.CityItem
import com.rimapps.citymap.repository.CityRepository
import com.rimapps.citymap.repository.RepositoryFactory

class MainViewModel(
    private var repository : CityRepository = RepositoryFactory.buildRepository()
): ViewModel() {
    private val _viewState = MutableLiveData<List<CityItem>>()

     val viewState : MutableLiveData<List<CityItem>>
         get() = _viewState

        fun loadCities(){
            val result = repository.getCities()
            _viewState.value = result.map {
                CityItem(it.country,it.capital)
            }

            Log.d("values", result.toString())
        }


}