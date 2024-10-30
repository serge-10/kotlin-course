package org.sergei.org.kotlincourse.lesson17.homework

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    // Тестирование ExtractFirst
    val m1 = ExtractFirst()
    ordinalNumbers.forEach { m1.addMaterial(it) }
    println("Extracted (First): ${m1.extract()}")
    m1.printContainer()

    // Тестирование ExtractLast
    val m2 = ExtractLast()
    ordinalNumbers.forEach { m2.addMaterial(it) }
    println("Extracted (Last): ${m2.extract()}")
    m2.printContainer()

    // Тестирование ExtractMiddle
    val m3 = ExtractMiddle()
    ordinalNumbers.forEach { m3.addMaterial(it) }
    println("Extracted (Middle): ${m3.extract()}")
    m3.printContainer()
}