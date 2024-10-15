package org.sergei.org.kotlincourse.lesson13

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    if (numbers.size < 5){
        println("OK")
    }

    numbers.isEmpty()
    numbers.isNotEmpty()

    val defaltValue = numbers.getOrElse(8) { it }

    val millitor = listOf(18, 17, 29, 31)
    println(millitor.filter { it in 18..30 })
}