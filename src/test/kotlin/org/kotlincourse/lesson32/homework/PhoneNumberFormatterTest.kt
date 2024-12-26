package org.kotlincourse.lesson32.homework


// Unit tests
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource
import org.sergei.org.kotlincourse.lesson32.homework.PhoneNumberFormatter
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class PhoneNumberFormatterTest {

    private val formatter = PhoneNumberFormatter()

    @ParameterizedTest
    @CsvSource(
        "'8 (922) 941-11-11', '+7 (922) 941-11-11'",
        "'79229411111', '+7 (922) 941-11-11'",
        "'+7 922 941 11 11', '+7 (922) 941-11-11'",
        "'9229411111', '+7 (922) 941-11-11'",
        "'abc +7 922 941 11 11', '+7 (922) 941-11-11'"
    )
    fun `valid phone numbers are formatted correctly`(input: String, expected: String) {
        assertEquals(expected, formatter.formatPhoneNumber(input))
    }

    @ParameterizedTest
    @ValueSource(strings = ["12345", "+1 (922) 941-11-11", "", "abcdefg"])
    fun `invalid phone numbers throw exception`(input: String) {
        assertFailsWith<IllegalArgumentException> { formatter.formatPhoneNumber(input) }
    }
}
