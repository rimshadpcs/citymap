package com.rimapps.citymap

class ListValidator {
    fun validateList(titles: List<String>): Boolean {

        for (i in titles){

            if (titles.contains("hello")){
                return true
            }
        }
        return false
    }
}