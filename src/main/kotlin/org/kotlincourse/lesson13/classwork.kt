package org.sergei.org.kotlincourse.lesson13

import java.util.logging.Filter

fun main() {
    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list) // Тут предполагается вызов функции filter, но её код отсутствует. Если это стандартная функция, она может фильтровать по заданному условию.
    println(filtered1)         // Вывод отфильтрованного списка.

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2) // Фильтрация элементов списка, которые находятся в диапазоне от 7 до 17 (включительно). Вывод результата.

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers) // Фильтрация положительных чисел из списка. Вывод положительных чисел.

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Фильтрация всех чисел, которые не являются положительными. Вывод отрицательных чисел и нулей (если бы были).

    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Фильтрация ненулевых значений из списка. Вывод списка без null.

    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Поиск первого положительного числа, если его нет, возвращается null. Вывод результата.

    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // Попытка получения элемента по индексу 10, если индекса нет, возвращается -1.

    val incrementedNumbers: List<String> = numbers.map { "$it%" }
    println(incrementedNumbers) // Преобразование каждого элемента списка в строку с добавлением символа "%" после числа.

    val numberSquareMap = numbers.associate { it to it * it }
    println(numberSquareMap) // Создание карты (словаря), где каждому числу соответствует его квадрат.

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    val flattenList = multipleList.flatten()
    println(flattenList) // "Сплющивание" списка списков в один список.

    val flattenListAfterMapping = multipleList.flatMap { list1: List<Int> -> list1.map { it * 2 } }
    println(flattenListAfterMapping) // Умножение каждого элемента списка списков на 2 и затем "сплющивание" результата.

    val numbersString = numbers.joinToString(separator = ", ")
    println(numbersString) // Преобразование списка чисел в строку, где элементы разделены запятыми.

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Сортировка чисел по возрастанию и вывод отсортированного списка.

    val numbersString1: String = numbers.joinToString(separator = " % ") { "$it * $it" }
    println(numbersString1) // Преобразование списка чисел в строку, где каждое число отображается как его произведение с самим собой, разделённое символом " % ".

    numbers.forEach {
        println(it)
    } // Итерация по каждому элементу списка и вывод каждого числа по одному.

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) // Подсчёт суммы всех чисел в списке и вывод результата.

    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Подсчёт среднего значения чисел в списке и вывод результата.

    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Поиск максимального числа в списке и вывод результата.

    val minNumber = numbers.minOrNull()
    println(minNumber) // Поиск минимального числа в списке и вывод результата.

    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Группировка чисел на положительные и отрицательные и вывод групп.

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Удаление дубликатов из списка и вывод уникальных значений.

    val numbers2 = listOf(1, 2, 3, 4, 5)
    println(numbers.take(3)) // Вывод первых трёх элементов списка.

    val numbers4 = listOf(1, 2, 3, 4, 5)
    println(numbers.takeLast(3)) // Вывод последних трёх элементов списка.

    println(numbers.size) // Вывод размера списка (количество элементов).


    // Практика


}


fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}
