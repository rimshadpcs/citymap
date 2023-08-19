package com.rimapps.citymap.api

import android.content.Context
import com.rimapps.citymap.App
import com.rimapps.citymap.data.CityDTO
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader

class LocalDataSourceHelper : DataSourceHelper {

    private var context: Context = App.applicationContext()
    private val bufferReader = BufferedReader(context.assets.open("cities.csv").reader())

    private var csvParser: CSVParser = CSVParser.parse(
        bufferReader, CSVFormat.DEFAULT
    )

     override fun parseCsv(): MutableList<CityDTO> {
        val list = mutableListOf<CityDTO>()
        csvParser.forEach {
            it?.let {
                val cities = CityDTO(
                it.get(3),
                it.get(5),)
                list.add(cities)
            }
        }

        return list
    }
}