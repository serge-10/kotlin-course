package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 6. Создай функцию расширение словаря из строк и чисел,
// которая принимает число и возвращает список ключей,
// длина которых меньше их значений но больше заданного в функции аргумента.

// В случае если список получается пустой нужно выкинуть исключение IllegalState.

//По аналогии с предыдущим заданием выполни трансформации и проверки.

// Функция-расширение для Map
fun Map<String, Int>.keyValue(arg: Int): List<String> {
    val result = this.filter { it.key.length < it.value && it.key.length > arg }
        .map { it.key }
    if (result.isEmpty()) throw IllegalStateException("Список ключей пуст.")
    return result
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val functionL6 = fun(map: Map<String, Int>, arg: Int): List<String> {
        val result = map.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) throw IllegalStateException("Список ключей пуст.")
        return result
    }

    // Создай аналогичное лямбда-выражение с указанием типа.
    val function61: (Map<String, Int>, Int) -> List<String> = { map, arg ->
        val result = map.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) throw IllegalStateException("Список ключей пуст.")
        result
    }

    // Создай лямбда-выражение без указания типа.
    val function62 = { map: Map<String, Int>, arg: Int ->
        val result = map.filter { it.key.length < it.value && it.key.length > arg }
            .map { it.key }
        if (result.isEmpty()) throw IllegalStateException("Список ключей пуст.")
        result
    }

    // Тестовые данные
    val map1 = mapOf("cat" to 4, "dog" to 5, "elephant" to 8, "fox" to 6)
    val map2 = mapOf("apple" to 10, "banana" to 6, "cherry" to 7)
    val emptyMap = emptyMap<String, Int>()

    // Проверка работы функций
    try {
        println(map1.keyValue(2))         // Ожидается: ["cat", "dog"]
        println(functionL6(map2, 3))     // Ожидается: ["banana"]
        println(function61(map1, 1))     // Ожидается: ["cat", "dog", "fox"]
        println(function62(map2, 5))     // Ожидается: []
    } catch (e: IllegalStateException) {
        println(e.message) // Обработка пустого списка
    }

    // Проверка работы с пустой картой
    try {
        println(emptyMap.keyValue(2)) // Ожидается: ошибка
    } catch (e: IllegalStateException) {
        println(e.message)
    }
}
