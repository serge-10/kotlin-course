package org.sergei.org.kotlincourse.lesson9

fun main() {
    val message = "Саша с днём рожденья"

    val totalWidth = message.length + 9 // По 3 звезды с каждой стороны
    val totalHeight = 7 // 3 строки сверху, 3 строки снизу, 1 строка для текста

    // Вывод верхней границы прямоугольника
    println("*".repeat(totalWidth))

    // Пустые строки с отступом
    for (i in 1..3) {
        println("*" + " ".repeat(totalWidth - 2) + "*")
    }

    // Строка с текстом, без звёздочек внутри
    println("*   $message    *")

    // Пустые строки с отступом
    for (i in 1..3) {
        println("*" + " ".repeat(totalWidth - 2) + "*")
    }

    // Вывод нижней границы прямоугольника
    println("*".repeat(totalWidth))
}
