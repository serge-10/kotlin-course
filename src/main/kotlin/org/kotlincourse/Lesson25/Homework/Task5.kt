package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 5. Создай функцию расширение списка чисел,
// которая будет возвращать список уникальных чисел (без дубликатов).

// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

// Функция-расширение для списка чисел
fun List<Number>.unique(): List<Number> {
    return toSet().toList()
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val functionL5 = fun(list: List<Number>): List<Number> {
        return list.toSet().toList()
    }

    // Создай аналогичное лямбда выражение с указанием типа.
    val function51: (List<Number>) -> List<Number> = { list ->
        list.toSet().toList()
    }

    // Создай лямбда выражение без указания типа.
    val function52 = { list: List<Number> ->
        list.toSet().toList()
    }

    // Тесты
    val list1 = listOf(1, 2, 2, 3, 4, 4, 5)
    val list2 = listOf(10, 20, 10, 30, 40, 20)
    val list3 = listOf(1.1, 1.1, 2.2, 3.3, 3.3)
    val emptyList = emptyList<Number>()

    // Проверка работы функций
    println(list1.unique())         // Ожидается: [1, 2, 3, 4, 5]
    println(functionL5(list2))      // Ожидается: [10, 20, 30, 40]
    println(function51(list3))      // Ожидается: [1.1, 2.2, 3.3]
    println(function52(emptyList)) // Ожидается: []
}
