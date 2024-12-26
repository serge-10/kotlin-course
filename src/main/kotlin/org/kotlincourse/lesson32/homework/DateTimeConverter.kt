package org.sergei.org.kotlincourse.lesson32.homework

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

class DateTimeConverter {
    fun convertToDateTime(input: String): LocalDateTime {
        val today = LocalDate.now()
        val yesterday = today.minusDays(1)

        return when {
            input.equals("Сегодня", ignoreCase = true) -> LocalDateTime.of(today, LocalTime.MIDNIGHT)
            input.equals("Вчера", ignoreCase = true) -> LocalDateTime.of(yesterday, LocalTime.MIDNIGHT)
            input.matches("\\d{2}:\\d{2}(?::\\d{2})?".toRegex()) -> {
                val time = LocalTime.parse(input, DateTimeFormatter.ofPattern(if (input.length == 5) "HH:mm" else "HH:mm:ss"))
                LocalDateTime.of(today, time)
            }
            input.matches("\\d{4}\\.\\d{2}\\.\\d{2}.*".toRegex()) -> parseDateTime(input, "yyyy.MM.dd")
            input.matches("\\d{1,2} \\p{L}+ \\d{4}.*".toRegex()) -> parseDateTime(input, "d MMM yyyy")
            else -> throw IllegalArgumentException("Invalid date-time format: $input")
        }
    }

    private fun parseDateTime(input: String, dateFormat: String): LocalDateTime {
        return try {
            if ("," in input) {
                val parts = input.split(", ")
                val date = LocalDate.parse(parts[0], DateTimeFormatter.ofPattern(dateFormat))
                val time = LocalTime.parse(parts[1], DateTimeFormatter.ofPattern(if (parts[1].length == 5) "HH:mm" else "HH:mm:ss"))
                LocalDateTime.of(date, time)
            } else {
                val date = LocalDate.parse(input, DateTimeFormatter.ofPattern(dateFormat))
                LocalDateTime.of(date, LocalTime.MIDNIGHT)
            }
        } catch (e: DateTimeParseException) {
            throw IllegalArgumentException("Invalid date-time format: $input", e)
        }
    }
}