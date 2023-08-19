package com.rimapps.citymap.repository

import com.rimapps.citymap.data.City
import com.rimapps.citymap.data.CityDTO

interface CityRepository {

    fun getCities():MutableList<City>
}