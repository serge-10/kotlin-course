package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

abstract class Operation {
    var operand1: Double = 0.0
    var operand2: Double = 0.0

    abstract fun execute(): String
    abstract fun matches(expression: String): Boolean

    // Метод для парсинга операндов из строки
    fun setOperands(expression: String, operator: String): Boolean {
        val parts = expression.split(operator)
        return if (parts.size == 2) {
            try {
                operand1 = parts[0].trim().toDouble()
                operand2 = parts[1].trim().toDouble()
                true
            } catch (e: NumberFormatException) {
                false
            }
        } else {
            false
        }
    }
}
