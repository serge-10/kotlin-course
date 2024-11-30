package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.

// По аналогии с предыдущим заданием выполни трансформации и проверки.
// Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun function4(arg: Long): Int {
    return arg.toString().map { it.digitToInt() }.sum()
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val function41 = fun(arg: Long): Int {
        return arg.toString().map { it.digitToInt() }.sum()
    }

    // Создай аналогичное лямбда-выражение с указанием типа.
    val function42: (Long) -> Int = { arg ->
        arg.toString().map { it.digitToInt() }.sum()
    }

    // Создай лямбда-выражение без указания типа.
    val function43 = { arg: Long ->
        arg.toString().map { it.digitToInt() }.sum()
    }

    // Тесты
    val number1 = 123456789L
    val number2 = 987654321L
    val number3 = 111111111L
    val number4 = 0L

    // Проверка работы функций
    println(function4(number1))    // Ожидается: 45
    println(function41(number2))  // Ожидается: 45
    println(function42(number3))  // Ожидается: 9
    println(function43(number4))  // Ожидается: 0
}
