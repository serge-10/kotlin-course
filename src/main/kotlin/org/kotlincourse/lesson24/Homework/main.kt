package org.sergei.org.kotlincourse.lesson24.Homework

fun main(){
        // задание 4

    try {
        // Выбрасываем своё исключение
        throw MyCustomException("Это моё собственное исключение!")
    } catch (e: MyCustomException) {
        println("Поймано исключение: ${e.message}")
    }

        // задание 5

    try {
        // Код, который провоцирует ArrayIndexOutOfBoundsException
        val array = arrayOf(1, 2, 3)
        println(array[5]) // Индексация вне границ массива
    } catch (e: ArrayIndexOutOfBoundsException) {
        // Выводим сообщение о перехваченной ошибке
        println("Перехвачено ArrayIndexOutOfBoundsException: ${e.message}")

        // Выбрасываем пользовательское исключение
        throw MyCustomRuntimeException(e)
    }
}