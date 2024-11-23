package org.sergei.org.kotlincourse.lesson24.Homework

// Задание 1. Воспроизвести фрагменты кода,
// которые могут привести к возникновению исключений:

fun main() {

    // NullPointerException

    val str: String? = null
    println(str!!.length)     // Использование "!!" вызывает NullPointerException

    // ArrayIndexOutOfBoundsException

    val array = arrayOf(1, 2, 3)
    println(array[3])     // Индексация вне границ массива

    // ClassCastException

    val obj: Any = "Kotlin"
    val number: Int = obj as Int   // Ошибка приведения

    // NumberFormatException

    val number1 = "abc".toInt() // Строка "abc" не может быть преобразована в число

    // IllegalArgumentException

    val age = -5
    if (age < 0) {
        throw IllegalArgumentException("Возраст не может быть отрицательным")
    }

    // IllegalStateException

    val list = mutableListOf(1, 2, 3) // Создаём изменяемый список
    val iterator = list.iterator()   // Получаем итератор для списка
    iterator.remove()                // Вызываем remove() без вызова next()

    // OutOfMemoryError

    val list2 = mutableListOf(" ")
    while (true) {
        list2.add("Абра Кадабра")
    }

    // StackOverflowError

    infiniteRecursion()

}

fun infiniteRecursion() {
    infiniteRecursion() // Рекурсивный вызов без базового условия
}
