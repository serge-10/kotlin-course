package org.sergei.org.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

// Создай функцию, которая принимает тип Temporal и выводит форматированное значение
// в зависимости от того, содержит ли аргумент время и часовой пояс.
// Temporal - это общий тип для разных классов даты-времени.
// В форматированном значении нужно выводить часы, минуты, секунды и таймзону,
// если они представлены в переданном объекте. Обработай в методе все типы дат,
// которые знаешь. Реализуй два варианта функции - с собственный форматированием
// и с форматами из ISO коллекции.


// Функция с собственным форматированием
fun formatAnyDate(temporal: Temporal?) {
    if (temporal == null) {
        println("Значение null")
        return
    }

    val formatted = when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is Instant -> temporal.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> "Неизвестный тип: $temporal"
    }
    println(formatted)
}

// Функция с форматами из ISO коллекции
fun formatTemporalISO(temporal: Temporal?): String {
    if (temporal == null) return "Значение null"

    return when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_DATE)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        is Instant -> temporal.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        else -> "Неизвестный формат: $temporal"
    }
}

// Пример вызова функций
fun main() {
    val localDate = LocalDate.now()
    val localTime = LocalTime.now()
    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val offsetDateTime = OffsetDateTime.now()
    val instant = Instant.now()

    println("Собственное форматирование:")
    formatAnyDate(localDate)
    formatAnyDate(localTime)
    formatAnyDate(localDateTime)
    formatAnyDate(zonedDateTime)
    formatAnyDate(offsetDateTime)
    formatAnyDate(instant)

    println("\nФорматирование ISO:")
    println(formatTemporalISO(localDate))
    println(formatTemporalISO(localDateTime))
    println(formatTemporalISO(zonedDateTime))
    println(formatTemporalISO(offsetDateTime))
    println(formatTemporalISO(instant))
}
