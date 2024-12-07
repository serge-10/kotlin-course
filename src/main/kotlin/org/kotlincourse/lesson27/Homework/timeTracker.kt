package org.sergei.org.kotlincourse.lesson27.Homework

// Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и
// измеряет время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах.
// Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

//fun timeTracker(function: () -> Unit): Long {
//    val startTime = System.currentTimeMillis()
//    function()
//    val endTime = System.currentTimeMillis()
//    return endTime - startTime
//}

fun <T> timeTracker(function: () -> T): Pair<Long, T> {
    val startTime = System.currentTimeMillis()
    val result = function() // Выполнение переданной функции
    val endTime = System.currentTimeMillis()
    return Pair(endTime - startTime, result) // Возвращаем время выполнения и результат
}

fun main() {

    val myFunction = {
        val list = List(10_000_000) { (0..10_000).random() }
        list.sorted()
    }

    val (elapsedTime, result) = timeTracker(myFunction) // Получаем время и результат
    println("Время выполнения: $elapsedTime мс")
    println("Результат: ${result.take(10)}") // Показываем первые 10 элементов результата
}


