package com.rimapps.citymap

class InputValidator {

    fun validateInput(amount : Int,title:String):Boolean{

        if(amount>0&&title.isNotEmpty()){
            return true
        }
        return false
    }
}