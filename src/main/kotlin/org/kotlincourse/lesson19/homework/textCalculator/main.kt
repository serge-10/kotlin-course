package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

fun main() {
    val calculator = Calculator()
    println(calculator.calculate("2 + 4"))
    println(calculator.calculate("5.5 * 2"))
    println(calculator.calculate("Привет + Мир"))
    println(calculator.calculate("Привет * 2"))
    println(calculator.calculate("Привет * 7.6"))
    println(calculator.calculate("22 - 2"))
    println(calculator.calculate("3 % 1"))
    println(calculator.calculate("2 % мир"))
    println(calculator.calculate("Привет % 2"))
    println(calculator.calculate("1 * Мир"))
    println(calculator.calculate("11 / Мир"))
    println(calculator.calculate("32 / 4"))
    println(calculator.calculate("14 / 0"))
    println(calculator.calculate("1 + мир"))
    println(calculator.calculate("10 - Мир"))
    println(calculator.calculate("10 : 1"))
    println(calculator.calculate("Привет - Мир"))
}