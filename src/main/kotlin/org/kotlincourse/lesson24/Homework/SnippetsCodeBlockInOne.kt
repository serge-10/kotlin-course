package org.sergei.org.kotlincourse.lesson24.Homework

// адание 3. Оберни все вызовы из предыдущего задания в блок try-catch
// с одним блоком catch для любого типа исключений. Внутри блока catch,
// используя when, напиши для каждого исключения вывод в консоль специфического сообщения,
// подходящего под каждый из типов.

fun main() {
    try {
        // NullPointerException

        val str: String? = null
        println(str!!.length) // Использование "!!" вызывает NullPointerException

        // ArrayIndexOutOfBoundsException

        val array = arrayOf(1, 2, 3)
        println(array[3]) // Индексация вне границ массива

        // ClassCastException

        val obj: Any = "Kotlin"
        val number: Int = obj as Int // Ошибка приведения

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
        iterator.remove() // Вызываем remove() без вызова next()

        // OutOfMemoryError

        val list2 = mutableListOf(" ")
        while (true) {
            list2.add("Абра Кадабра")
        }

        // StackOverflowError

        infiniteRecursion3()
    } catch (e: Throwable) { // Ловим любые исключения или ошибки
        when (e) {
            is NullPointerException -> println("NullPointerException: Обращение к null-объекту")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException: Индекс выходит за пределы массива")
            is ClassCastException -> println("ClassCastException: Неверное приведение типа")
            is NumberFormatException -> println("NumberFormatException: Неверный формат числа")
            is IllegalArgumentException -> println("IllegalArgumentException: Некорректный аргумент")
            is IllegalStateException -> println("IllegalStateException: Неверное состояние объекта")
            is OutOfMemoryError -> println("OutOfMemoryError: Программа исчерпала память")
            is StackOverflowError -> println("StackOverflowError: Переполнение стека из-за рекурсии")
            else -> println("Неизвестная ошибка")
        }
    }
}

// Функция для вызова StackOverflowError

fun infiniteRecursion3() {
    infiniteRecursion() // Рекурсивный вызов без базового условия
}
