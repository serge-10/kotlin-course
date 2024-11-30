package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 2. Создай функцию, которая принимает список чисел
// и возвращает среднее арифметическое этого списка.
// С помощью require проверь, что список не пустой.

// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь, что лямбда выражение работает правильно с
// помощью нескольких наборов данных (в том числе пустого).

fun function2(arg: List<Int>): Double {
    require(arg.isNotEmpty()) { "Список не должен быть пустым" }
    return arg.sum() / arg.size.toDouble()
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val function21 = fun(arg: List<Int>): Double {
        require(arg.isNotEmpty()) { "Список не должен быть пустым" }
        return arg.sum() / arg.size.toDouble()
    }

    // Создай аналогичное лямбда выражение с указанием типа.
    val function22: (List<Int>) -> Double = {
        require(it.isNotEmpty()) { "Список не должен быть пустым" }
        it.sum() / it.size.toDouble()
    }

    // Создай лямбда выражение без указания типа.
    val function23 = { arg: List<Int> ->
        require(arg.isNotEmpty()) { "Список не должен быть пустым" }
        arg.sum() / arg.size.toDouble()
    }

    // Тесты
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(10, 20, 30)
    val emptyList = emptyList<Int>()

    // Проверка работы функций
    println(function2(list1))       // Ожидается: 2.0
    println(function21(list2))     // Ожидается: 20.0
    println(function22(list1))     // Ожидается: 2.0
    println(function23(list2))     // Ожидается: 20.0

    // Проверка работы с пустым списком
    try {
        println(function2(emptyList)) // Ожидается: ошибка
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}