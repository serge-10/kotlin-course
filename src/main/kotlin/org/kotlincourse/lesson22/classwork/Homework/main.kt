package org.sergei.org.kotlincourse.lesson22.classwork.Homework

fun main() {
    // 1. Функция для массива
    println("Задача 1")
    val numbers = arrayOf(3, 1, 7, 5)
    println(numbers.toMinMaxPair()) // Output: (1, 7)

    // 2. Функция для Char?
    println("Задача 2")
    val char: Char? = 'A'
    char.processChar(5, 10, true)  // Output: Char: A, Sum: 15, Bool: true
    val nullChar: Char? = null
    nullChar.processChar(2, 3, false) // Output: Null Char, Sum: 5, Bool: false

    // 3. Функция для MutableList
    println("Задача 3")
    val mutableList = mutableListOf("a", "b", "c")
    println(mutableList.updateOrRetrieve("z", 1)) // Output: b
    println(mutableList) // Output: [a, z, c]

    // 4. Функция для словаря
    println("Задача 4")
    val dictionary: Map<Int, List<Int>>? = mapOf(
        1 to listOf(10, 20, 30),
        2 to listOf(40, 50),
        3 to listOf()
    )
    println(dictionary.returnMapGenericNull(1)) // Output: {1=20, 2=50, 3=null}

    // 5. Функция для Long?
    println("Задача 5")
    val longValue: Long? = 123456789L
    println(longValue.toFormattedString()) // Output: Long value: 123456789
    val nullLong: Long? = null
    println(nullLong.toFormattedString()) // Output: Null Long


    //пидмаркоз
    println("пидмаркоз")
    val word = "пидмаркоз"
    val authors = listOf("user1", "user2", "user3")

    // Вызов метода расширения
    word.spellOutWithAuthors(authors)
}