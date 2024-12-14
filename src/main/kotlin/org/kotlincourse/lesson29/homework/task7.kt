package org.sergei.org.kotlincourse.lesson29.homework

import java.time.LocalDate
import java.time.format.DateTimeFormatter

// Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
// Создай форматтер, который форматирует дату в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))

fun main() {
    // Создание объектов дат
    val date2023 = LocalDate.of(2023, 2, 25)
    val date2024 = LocalDate.of(2024, 2, 25)

    // Создание форматтера
    val formatter = DateTimeFormatter.ofPattern("MMMM dd") // Форматирует в "Февраль 25"

    // Прибавление 10 дней и форматирование
    val newDate2023 = date2023.plusDays(10)
    val newDate2024 = date2024.plusDays(10)

    // Вывод отформатированных дат
    println("Дата 2023 + 10 дней: ${newDate2023.format(formatter)}")
    println("Дата 2024 + 10 дней: ${newDate2024.format(formatter)}")

    // Нахождение отличий
    val isLeapYear2024 = date2024.isLeapYear
    println("\nФевраль 2024 является високосным? $isLeapYear2024")
    println("Отличие: в високосном году (2024) 29 февраля существует, поэтому дата сдвигается.")
}