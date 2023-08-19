package com.rimapps.citymap

import org.junit.Test


class InputValidatorTest{

    private val inputValidator = InputValidator()


    @Test
    fun `validate input when it returns true`(){
        val amount = 100
        val title = "Hello"

        val result = inputValidator.validateInput(amount,title)

        assert(result).equals(true)

    }




}