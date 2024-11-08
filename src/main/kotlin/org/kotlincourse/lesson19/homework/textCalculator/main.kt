package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

fun main() {
    val calculator = Calculator()
    calculator.addOperation(Addition())
    calculator.addOperation(Subtraction())
    // Можно добавить другие операции, например, умножение или деление.

    val expression = "5 + 3"
    println("Результат: ${calculator.calculate(expression)}")  // Выведет: Результат: 8.0
}
