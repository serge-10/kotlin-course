package org.sergei.org.kotlincourse.lesson29.homework

import java.time.Instant
import java.time.LocalDate
import java.time.Period

// Создай период между датой своего рождения и текущей датой.
// Выведи на печать количество лет из этого периода.

fun main() {
    val birthday = LocalDate.of(1980, 5, 10)
    val today = LocalDate.now()
    val period = Period.between(birthday, today)
    println("Количество лет: ${period.years}")
}
