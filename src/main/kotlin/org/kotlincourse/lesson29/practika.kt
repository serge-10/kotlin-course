package org.sergei.org.kotlincourse.lesson29

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime

fun main() {
    val currentTime = Instant.now()

    val myTime = Instant.ofEpochSecond(3355544)
    println(myTime)

    val dayOne = LocalDate.of(2024, 9, 1)
    val day2 = LocalDate.of(2025, 5, 31)
    val diferentDays = Period.between(dayOne, day2)
    println(diferentDays)

    val day3 = Period.of(2, 4,430)
    println(day2.plus(day3))


    val calendar = ZonedDateTime.of(2024, 12, 16, 10, 0, 0 ,0, ZoneId.of("Evrope/Moskow"))

    println(diferentDays.multipliedBy(2))


}


