package org.sergei.org.kotlincourse.lesson29.homework

import java.time.LocalDate

// Создайте функцию identifyGeneration, которая принимает дату рождения
// в формате LocalDate и печатает строку, определяющую,
// к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
// Если дата рождения не попадает ни в один из этих диапазонов,
// функция должна возвращать "Не определено".
// Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate).
// Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.



private val BOOMER_START_DATE = LocalDate.of(1946, 1, 1)
private val BOOMER_END_DATE = LocalDate.of(1964, 12, 31)
private val ZOOMER_START_DATE = LocalDate.of(1997, 1, 1)
private val ZOOMER_END_DATE = LocalDate.of(2012, 12, 31)

fun identifyGeneration(birthDate: LocalDate): String {
    return when {
        !birthDate.isBefore(BOOMER_START_DATE) && !birthDate.isAfter(BOOMER_END_DATE) -> "Бумер"
        !birthDate.isBefore(ZOOMER_START_DATE) && !birthDate.isAfter(ZOOMER_END_DATE) -> "Зумер"
        else -> "Не определено"
    }
}

// Пример вызова функции
fun main() {
    val birthDate1 = LocalDate.of(1955, 7, 20) // Пример для Бумера
    val birthDate2 = LocalDate.of(2000, 5, 15) // Пример для Зумера
    val birthDate3 = LocalDate.of(1985, 10, 30) // Пример для "Не определено"

    println("Поколение для 1955-07-20: ${identifyGeneration(birthDate1)}") // Ожидается "Бумер"
    println("Поколение для 2000-05-15: ${identifyGeneration(birthDate2)}") // Ожидается "Зумер"
    println("Поколение для 1985-10-30: ${identifyGeneration(birthDate3)}") // Ожидается "Не определено"
}