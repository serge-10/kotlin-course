package org.kotlincourse.lesson32

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.sergei.org.kotlincourse.lesson32.textToPhone

class TextToPhoneTest {

    @ParameterizedTest
    @MethodSource("providePhoneNumbers")
    fun `check convertation`(
        phoneNumber: String,
        expected: String
    ) {
        val actual = textToPhone(phoneNumber)
        assertEquals(expected, actual)
    }

    //добавить негативные тесты -- недостаточное количество, другие цифры в начале
    //сделать разные варианты данных (использовать регулярку)

    companion object {
        @JvmStatic
        fun providePhoneNumbers() = listOf(
            Arguments.of("81234567890", "+7 (123) 456-78-90"),
            Arguments.of("8(123)4567890 Вася", "+7 (123) 456-78-90"),
            Arguments.of("7(123)4567890", "+7 (123) 456-78-90")
        )
    }
}