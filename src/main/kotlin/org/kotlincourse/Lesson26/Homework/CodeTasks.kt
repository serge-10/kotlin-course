package org.sergei.org.kotlincourse.Lesson26.Homework

// Задания на разработку кода

// Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр,
// оставляющую только строки, удовлетворяющие условию
// (то-есть принимающая строку и возвращающая булево значение).
// Функция должна вернуть результат фильтрации исходного списка строк.

fun filterStrings(
    list: List<String>,
    filterFunction: (String) -> Boolean
): List<String> {
    return list.filter(filterFunction)
}

// Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
// преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
// Функция должна вернуть результат преобразования исходного списка чисел.

fun applyToNumbers(
    list: List<Number>,
    functionTransform: (Number) -> Number
): List<Number> {
    return list.map(functionTransform)
}

// Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
// определяющую условие для включения числа в сумму.
// Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition(
    list: List<Number>,
    functionSum: (Number) -> Boolean
): Double {
    return list.filter(functionSum).sumOf { it.toDouble() }
}

// Напишите функцию combineAndTransform, которая принимает две коллекции одного типа
// и функцию для их объединения и преобразования в одну коллекцию другого типа.
// Функция должна вернуть результат преобразования (коллекцию второго типа)

fun <T, R> combineAndTransform(
    list1: List<T>,
    list2: List<T>,
    transform: (List<T>) -> List<R>
): List<R> {
    val combinedList = list1 + list2
    return transform(combinedList)
}


fun main() {
    // Пример для filterStrings
    val list1 = listOf("apple", "banana", "kiwi", "orange")
    val result1 = filterStrings(list1) { it.length > 5 }
    println("Filtered by length > 5: $result1")  // ["banana", "orange"]

    val result2 = filterStrings(list1) { it.contains("a") }
    println("Filtered by containing 'a': $result2")  // ["apple", "banana", "orange"]

    // Пример для applyToNumbers
    val list2 = listOf(1, 2, 3, 4, 5)
    val result3 = applyToNumbers(list2) { it.toInt() * 2 }
    println("Doubled numbers: $result3")  // [2, 4, 6, 8, 10]

    val result4 = applyToNumbers(list2) { it.toInt() * it.toInt() }
    println("Squared numbers: $result4")  // [1, 4, 9, 16, 25]

    // Пример для sumByCondition
    val list3 = listOf(1, 2, 3, 4, 5, 6)
    val result5 = sumByCondition(list3) { it.toInt() % 2 == 0 }
    println("Sum of even numbers: $result5")  // 12 (2 + 4 + 6)

    val result6 = sumByCondition(list3) { it.toInt() > 3 }
    println("Sum of numbers greater than 3: $result6")  // 15 (4 + 5 + 6)

    // Пример для combineAndTransform
    val list4 = listOf(1, 2, 3)
    val list5 = listOf(4, 5, 6)

    val result7 = combineAndTransform(list4, list5) { combinedList ->
        combinedList.map { it.toString() + " length: " + it.toString().length }
    }
    println("Combined and transformed (length of numbers as string): $result7")
    // ["1 length: 1", "2 length: 1", "3 length: 1", "4 length: 1", "5 length: 1", "6 length: 1"]

    val result8 = combineAndTransform(list4, list5) { combinedList ->
        combinedList.map { it.toInt() * it.toInt() }
    }
    println("Combined and transformed (squared numbers): $result8")  // [1, 4, 9, 16, 25, 36]
}