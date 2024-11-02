package org.sergei.org.kotlincourse.lesson18.homework.Printer

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val longText = "The quick brown fox jumps over the lazy dog and runs away into the sunset with a joyful bark."

    println("Лазерный принтер:")
    laserPrinter.printText(longText)

    println("\nСтруйный принтер:")
    inkjetPrinter.printText(longText)
}