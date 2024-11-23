package org.sergei.org.kotlincourse.lesson24.Homework

// Задание 2. Оберни все вызовы из предыдущего задания в блок
// try-catch и создай для каждого типа ошибки свой catch блок


fun main() {
    // NullPointerException

    try {
        val str: String? = null
        println(str!!.length) // Использование "!!" вызывает NullPointerException
    } catch (e: NullPointerException) {
        println("NullPointerException: Обращение к null-объекту")
    }

    // ArrayIndexOutOfBoundsException

    try {
        val array = arrayOf(1, 2, 3)
        println(array[3])      // Индексация вне границ массива
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException: Индекс выходит за пределы массива")
    }

    // ClassCastException

    try {
        val obj: Any = "Kotlin"
        val number: Int = obj as Int // Ошибка приведения
    } catch (e: ClassCastException) {
        println("ClassCastException: Неверное приведение типа")
    }

    // NumberFormatException

    try {
        val number1 = "abc".toInt() // Строка "abc" не может быть преобразована в число
    } catch (e: NumberFormatException) {
        println("NumberFormatException: Неверный формат числа")
    }

    // IllegalArgumentException

    try {
        val age = -5
        if (age < 0) {
            throw IllegalArgumentException("Возраст не может быть отрицательным")
        }
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException: Некорректный аргумент")
    }

    // IllegalStateException

    try {
        val list = mutableListOf(1, 2, 3) // Создаём изменяемый список
        val iterator = list.iterator()   // Получаем итератор для списка
        iterator.remove()              // Вызываем remove() без вызова next()
    } catch (e: IllegalStateException) {
        println("IllegalStateException: Неверное состояние объекта")
    }

    // OutOfMemoryError

    try {
        val list2 = mutableListOf(" ")
        while (true) {
            list2.add("Абра Кадабра")
        }
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError: Программа исчерпала память")
    }

    // StackOverflowError

    try {
        infiniteRecursion1()
    } catch (e: StackOverflowError) {
        println("StackOverflowError: Переполнение стека из-за рекурсии")
    }
}

// Функция для вызова StackOverflowError

fun infiniteRecursion1() {
    infiniteRecursion() // Рекурсивный вызов без базового условия
}
