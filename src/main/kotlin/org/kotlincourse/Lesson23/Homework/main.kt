package org.sergei.org.kotlincourse.Lesson23.Homework

fun main() {
    // Задача 1: Проверка analyzeDataType
    println("Задача 1:")
    analyzeDataType("Hello, world!")  // Ожидаем: Это строка: Hello, world!
    analyzeDataType(42)              // Ожидаем: Это целое число: 42
    analyzeDataType(listOf(1, 2, 3)) // Ожидаем: Это список, количество элементов: 3
    analyzeDataType(mapOf(1 to "a")) // Ожидаем: Это карта, количество пар: 1
    analyzeDataType(3.14)            // Ожидаем: Неизвестный тип данных

    println("\nЗадача 2:")
    // Задача 2: Проверка safeCastToList
    println(safeCastToList(listOf(1, 2, 3))) // Ожидаем: 3
    println(safeCastToList("Not a list"))    // Ожидаем: -1

    println("\nЗадача 3:")
    // Задача 3: Проверка getStringLengthOrZero
    println(getStringLengthOrZero("Hello"))  // Ожидаем: 5
    println(getStringLengthOrZero(42))       // Ожидаем: 0
    println(getStringLengthOrZero(null))     // Ожидаем: 0

    println("\nЗадача 4:")
    // Задача 4: Проверка squareNumber
    println(squareNumber(4))         // Ожидаем: 16.0
    println(squareNumber("4.2"))     // Ожидаем: 17.64
    println(squareNumber("abc"))     // Ожидаем: null
    println(squareNumber(true))      // Ожидаем: null

    println("\nЗадача 5:")
    // Задача 5: Проверка sumIntOrDoubleValues
    println(sumIntOrDoubleValues(listOf(1, 2.5, "hello", 3, null, 4.0))) // Ожидаем: 10.5

    println("\nЗадача 6:")
    // Задача 6: Проверка tryCastToListAndPrint
    tryCastToListAndPrint(listOf("a", "b", 3, "d")) // Ожидаем: строки "a", "b", предупреждение для 3, строку "d"
    tryCastToListAndPrint("Not a list")            // Ожидаем: "Not a list не является списком."
}
