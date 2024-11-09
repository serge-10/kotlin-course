package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

class Addition : Operation("+") {
    override fun execute(operands: Pair<Double, Double>): String {
        return (operands.first + operands.second).toString()
    }
}

class Subtraction : Operation("-") {
    override fun execute(operands: Pair<Double, Double>): String {
        return (operands.first - operands.second).toString()
    }
}

class Multiplication : Operation("*") {
    override fun execute(operands: Pair<Double, Double>): String {
        return (operands.first * operands.second).toString()
    }
}

class Division : Operation("/") {
    override fun execute(operands: Pair<Double, Double>): String {
        return if (operands.second == 0.0) "Ошибка: деление на ноль" else (operands.first / operands.second).toString()
    }
}

class Modulus : Operation("%") {
    override fun execute(operands: Pair<Double, Double>): String {
        return if (operands.second == 0.0) "Ошибка: деление на ноль" else (operands.first % operands.second).toString()
    }
}