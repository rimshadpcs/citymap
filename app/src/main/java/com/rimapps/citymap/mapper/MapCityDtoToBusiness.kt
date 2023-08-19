package com.rimapps.citymap.mapper

import com.rimapps.citymap.data.City
import com.rimapps.citymap.data.CityDTO

class MapCityDtoToBusiness {

    companion object {
        fun mapDtoToBusiness(cityDTO: CityDTO): City {
            return City(
                country = cityDTO.country,
                capital = cityDTO.capital
            )
        }
    }
}