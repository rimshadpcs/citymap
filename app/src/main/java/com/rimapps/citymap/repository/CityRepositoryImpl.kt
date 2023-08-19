package com.rimapps.citymap.repository

import com.rimapps.citymap.api.DataSourceFactory
import com.rimapps.citymap.api.DataSourceHelper
import com.rimapps.citymap.data.City
import com.rimapps.citymap.data.CityDTO
import com.rimapps.citymap.mapper.MapCityDtoToBusiness

class CityRepositoryImpl(
    private var dataSource: DataSourceHelper = DataSourceFactory.buildDataSource()
) : CityRepository {


    override fun getCities(): MutableList<City> {
        val cityDTOs = dataSource.parseCsv()
        return cityDTOs.map { MapCityDtoToBusiness.mapDtoToBusiness(it) }.toMutableList()
    }
}