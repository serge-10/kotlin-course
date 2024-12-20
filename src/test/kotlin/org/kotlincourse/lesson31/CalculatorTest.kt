package org.kotlincourse.lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.sergei.org.kotlincourse.lesson31.Calculator


class CalculatorTest{
    @Test
    fun plus(){
        val cals = Calculator()
        val result = cals.plus(2, 3)
        Assertions.assertEquals(result, 5)

    }
}