package com.rimapps.citymap.api

object DataSourceFactory {

    fun buildDataSource(): DataSourceHelper {
        return LocalDataSourceHelper()
    }
}