package org.sergei.org.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

// Создай объекты дат и / или времени которые мы изучили и по очереди передай
// их в метод созданный выше. Не используй в них метод now()

//fun formatAnyDate(temporal: Temporal?) {
//    if (temporal == null) {
//        println("Значение null")
//        return
//    }
//
//    val formatted = when (temporal) {
//        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
//        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
//        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
//        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
//        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
//        is Instant -> temporal.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
//        else -> "Неизвестный тип: $temporal"
//    }
//    println(formatted)
//}
//
//fun formatTemporalISO(temporal: Temporal?): String {
//    if (temporal == null) return "Значение null"
//
//    return when (temporal) {
//        is LocalDate -> temporal.format(DateTimeFormatter.ISO_DATE)
//        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
//        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
//        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
//        is Instant -> temporal.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
//        else -> "Неизвестный формат: $temporal"
//    }
//}

fun main() {
    // Создание объектов без метода now()
    val localDate = LocalDate.of(2000, 1, 1) // 1 января 2000 года
    val localTime = LocalTime.of(14, 30, 15) // 14:30:15
    val localDateTime = LocalDateTime.of(2023, 12, 31, 23, 59, 59) // 31 декабря 2023 года, 23:59:59
    val zonedDateTime = ZonedDateTime.of(2025, 6, 15, 10, 0, 0, 0, ZoneId.of("Europe/Moscow")) // 15 июня 2025 года, 10:00:00, Москва
    val offsetDateTime = OffsetDateTime.of(2018, 8, 20, 8, 0, 0, 0, ZoneOffset.of("+02:00")) // 20 августа 2018 года, 08:00:00, GMT+2
    val instant = Instant.parse("2020-02-29T12:00:00Z") // 29 февраля 2020 года, 12:00:00 UTC

    // Передача в функции
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