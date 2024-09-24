package org.sergei.org.kotlincourse.lesson4

class lesson4 {
}

val myint: Int = 5
val myFloat: Float = 0.58F
val myLong: Long = 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val MyDouble: Double = 5.99

val isKotlinFun: Boolean = true // false

val letter: Char ='A' //любой символ

val text: String = ""

val numbers: Array<Int> = arrayOf(1,2,3)
val strings: MutableList<String> = mutableListOf("one","two","one")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<String, String> = mapOf(
    "Ллюч 1" to "Значение 1 ",
    "Ключ 2 " to  "Значение 2 "
)

val anything: Any = false


fun printMessage(message: String) {
    println(message)
}

fun fail(message: String): Nothing{
    throw  IllegalArgumentException(message)

}
