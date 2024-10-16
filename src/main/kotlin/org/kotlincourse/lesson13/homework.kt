package org.sergei.org.kotlincourse.lesson13

fun main(){

    // Проверить, что размер коллекции больше 5 элементов.

    val numbers1 = listOf(1, 2, 3, 4, 5, 6)
    println(numbers1.size > 5)


    // Проверить, что коллекция пустая

    val numbers2 = listOf<Int>()             // Пустой список
    println(numbers2.isEmpty())



    // Проверить, что коллекция не пустая

    val  numbers3 = listOf(1, 2, 3, 4)
    println(numbers3.isNotEmpty())

    // Взять элемент по индексу или создать значение если индекса не существует

    val numbers4 = listOf(1, 2, 3, 4)
    println(numbers4.getOrElse(5) { 10 })

    // Собрать коллекцию в строку

    val numbers5 = listOf(4, 5, 6, 7, 8, 9)
    println(numbers5.joinToString(separator = ", ")) // Собираем элементы в строку, разделяя их запятыми

    // Посчитать сумму всех значений

    val numbers6 = listOf(1, 5, 6, 8, 9)
    println(numbers6.sum())

    // Посчитать среднее

    val numbers7 = listOf(4, 5, 8, 9, 7, 5)
    println(numbers7.average())

    // Взять максимальное число

    val numbers8 = listOf(2, 6, 7, 45, 57, 43)
    println(numbers8.maxOrNull())

    // Взять минимальное число

    val number9 = listOf(2, 6, 7, 45, 57, 43)
    println(number9.minOrNull())

    // Взять первое число или null

    val number10 = listOf(1, 5, 7, 8, 6)
    println(number10.firstOrNull())

    // Проверить что коллекция содержит элемент

    val number11 = listOf(1, 5, 7, 5)
    println(number11.contains(4))

    //


}