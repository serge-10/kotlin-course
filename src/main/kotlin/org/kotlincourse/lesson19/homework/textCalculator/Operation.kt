package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

abstract class Operation(
    val symbol: String
) {
    abstract fun execute(operands: Pair<Double, Double>): String
}
