package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

class Calculator {
    private val operations = mutableListOf<Operation>()

    // Метод для добавления новой операции в калькулятор
    fun addOperation(operation: Operation) {
        operations.add(operation)
    }

    // Метод для выполнения вычисления
    fun calculate(expression: String): String {
        for (operation in operations) {
            if (operation.matches(expression)) {
                if (operation.setOperands(expression, operation.javaClass.simpleName)) {
                    return operation.execute()
                }
                return "Ошибка: Невозможно распознать операнды"
            }
        }
        return "Ошибка: Операция не поддерживается"
    }
}
