package com.rimapps.citymap.repository

import com.rimapps.citymap.repository.CityRepository
import com.rimapps.citymap.repository.CityRepositoryImpl

object RepositoryFactory {

    fun buildRepository(): CityRepository {
        return CityRepositoryImpl()
    }

}