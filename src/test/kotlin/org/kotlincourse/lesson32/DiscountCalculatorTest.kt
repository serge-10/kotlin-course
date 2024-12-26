package org.kotlincourse.lesson32

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.sergei.org.kotlincourse.lesson32.calculateDiscountedPrice
import kotlin.test.assertEquals

class DiscountCalculatorTest {

    @Test
    fun `should return original price when discount is 0`() {
        val originalPrice = 100.0
        val discountPercentage = 0
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(100.0, actualPrice, 0.01, "Цена без скидки рассчитана неверно")
    }

    @Test
    fun `should calculate 50 percent discount`() {
        val originalPrice = 200.0
        val discountPercentage = 50
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(100.0, actualPrice, 0.01, "50% скидка рассчитана неверно")
    }

    @Test
    fun `should return 0 when discount is 100 percent`() {
        val originalPrice = 50.0
        val discountPercentage = 100
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(0.0, actualPrice, 0.01, "Полная скидка рассчитана неверно")
    }

    @Test
    fun `should calculate 25 percent discount`() {
        val originalPrice = 99.99
        val discountPercentage = 25
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(74.99, actualPrice, 0.01, "25% скидка рассчитана неверно")
    }

    @Test
    fun `should throw exception when original price is negative`() {
        val originalPrice = -10.0
        val discountPercentage = 10
        assertThrows<IllegalArgumentException> {
            calculateDiscountedPrice(originalPrice, discountPercentage)
        }
    }

    

    @Test
    fun `should throw exception when discount percentage is out of range`() {
        val originalPrice = 100.0
        val discountPercentage = 150
        assertThrows<IllegalArgumentException> {
            calculateDiscountedPrice(originalPrice, discountPercentage)
        }
    }
}
