package org.kotlincourse.lesson32.homework

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource
import org.sergei.org.kotlincourse.lesson32.homework.DateTimeConverter
import java.time.LocalDate
import java.time.LocalDate.*
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class DateTimeConverterTest {

    private val converter = DateTimeConverter()

    @ParameterizedTest
    @CsvSource(
        "Сегодня, 2024-12-26T00:00",  // Замените дату на текущую
        "Вчера, 2024-12-25T00:00",   // Замените дату на текущую - 1 день
        "01:01, 2024-12-26T01:01",
        "01:01:01, 2024-12-26T01:01:01",
        "2024.01.01, 2024-01-01T00:00",
        "2024.01.01 22:10, 2024-01-01T22:10",
        "2024.01.01 22:10:15, 2024-01-01T22:10:15",
        "1 янв 2024, 2024-01-01T00:00",
        "1 янв 2024, 22:10, 2024-01-01T22:10",
        "1 янв 2024, 22:10:15, 2024-01-01T22:10:15"
    )
    fun `valid date-time inputs are converted correctly`(input: String, expected: String) {
        assertEquals(LocalDateTime.parse(expected), converter.convertToDateTime(input))
    }


    @ParameterizedTest
    @ValueSource(strings = ["Invalid", "32 янв 2024", "2024/01/01", "25:61", "2024.01.01 25:61"])
    fun `invalid date-time inputs throw exception`(input: String) {
        assertFailsWith<IllegalArgumentException> { converter.convertToDateTime(input) }
    }
}
