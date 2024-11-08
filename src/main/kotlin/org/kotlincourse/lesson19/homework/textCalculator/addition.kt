package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

class Addition : Operation() {
    override fun execute(): String {
        return (operand1 + operand2).toString()
    }

    override fun matches(expression: String): Boolean {
        return expression.contains("+")
    }
}

class Subtraction : Operation() {
    override fun execute(): String {
        return (operand1 - operand2).toString()
    }

    override fun matches(expression: String): Boolean {
        return expression.contains("-")
    }
}
