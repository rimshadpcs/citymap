package com.rimapps.citymap

import org.junit.Test


class ListValidatorTest{

    private val listValidator = ListValidator()


    @Test
    fun `validate list contains empty strings`(){

        val list = listOf("hello","hell")

        val result = listValidator.validateList(list)

        assert(result).equals(true)

    }

}