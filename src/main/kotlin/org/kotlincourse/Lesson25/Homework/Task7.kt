package org.sergei.org.kotlincourse.Lesson25.Homework

// Задание 7. Создай функцию расширения словаря из списка и множества,
// которая принимает все известные тебе типы (вспомни все что знаешь и под каждый тип создай аргумент)
// и возвращает строку. Функция должна распечатать все данные,
// которые тебе в ней доступны и вернуть конкатенацию всех данных которые ей доступны (порядок неважен).
// Конкатенация - это присоединение. Код должен быть отформатирован таким образом, чтобы легко читался.
// По аналогии с предыдущим заданием выполни трансформации

// Функция расширения
fun Map<List<Any?>, Set<Any?>>.processData(arg: Any?): String {
    println("Аргумент: $arg")
    for ((k, v) in this) {
        println("Ключ: ${k.toString()}, Значение: ${v.toString()}")
    }
    return this.map { (k, v) -> k.toString() + v.toString() }
        .joinToString(", ")
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val function71 = fun Map<List<Any?>, Set<Any?>>.processData(arg: Any?): String {
        println("Аргумент: $arg")
        for ((k, v) in this) {
            println("Ключ: ${k.toString()}, Значение: ${v.toString()}")
        }
        return this.map { (k, v) -> k.toString() + v.toString() }
            .joinToString(", ")
    }

    // Создай аналогичное лямбда-выражение с указанием типа.
    val function72: Map<List<Any?>, Set<Any?>>.(arg: Any?) -> String = { arg ->
        println("Аргумент: $arg")
        for ((k, v) in this) {
            println("Ключ: ${k.toString()}, Значение: ${v.toString()}")
        }
        return this.map { (k, v) -> k.toString() + v.toString() }
            .joinToString(", ")
    }

    // Создай лямбда-выражение без указания типа.
    val function73 = { arg: Any? ->
        println("Аргумент: $arg")
        for ((k, v) in this) {
            println("Ключ: ${k.toString()}, Значение: ${v.toString()}")
        }
         return this.map { (k, v) -> k.toString() + v.toString() }
            .joinToString(", ")
    }


}




