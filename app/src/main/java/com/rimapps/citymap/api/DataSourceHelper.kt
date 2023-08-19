package com.rimapps.citymap.api

import com.rimapps.citymap.data.CityDTO

interface DataSourceHelper {

    fun parseCsv(): MutableList<CityDTO>
}