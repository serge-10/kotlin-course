package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 3. Создай функцию, которая принимает список строк и число,
// а возвращает список из строк, длина которых больше или равна заданному числу.
// Если список пуст, нужно выкинуть исключение.

// По аналогии с предыдущим заданием выполни трансформации и проверки.

fun function3(arg: List<String>, arg2: Int): List<String> {
    require(arg.isNotEmpty()) { "Список не должен быть пустым" }
    return arg.filter { it.length >= arg2 }
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val function31 = fun(arg: List<String>, arg2: Int): List<String> {
        require(arg.isNotEmpty()) { "Список не должен быть пустым" }
        return arg.filter { it.length >= arg2 }
    }

    // Создай аналогичное лямбда выражение с указанием типа.
    val function32: (List<String>, Int) -> List<String> = { arg, arg2 ->
        require(arg.isNotEmpty()) { "Список не должен быть пустым" }
        arg.filter { it.length >= arg2 }
    }

    // Создай лямбда выражение без указания типа.
    val function33 = { arg: List<String>, arg2: Int ->
        require(arg.isNotEmpty()) { "Список не должен быть пустым" }
        arg.filter { it.length >= arg2 }
    }

    // Тесты
    val list1 = listOf("cat", "dog", "elephant", "fox")
    val list2 = listOf("hello", "world", "kotlin", "java")
    val emptyList = emptyList<String>()

    // Проверка работы функций
    println(function3(list1, 4))        // Ожидается: ["elephant"]
    println(function31(list2, 5))      // Ожидается: ["hello", "world", "kotlin"]
    println(function32(list1, 3))      // Ожидается: ["cat", "dog", "elephant", "fox"]
    println(function33(list2, 6))      // Ожидается: ["kotlin"]

    // Проверка работы с пустым списком
    try {
        println(function3(emptyList, 3)) // Ожидается: ошибка
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}