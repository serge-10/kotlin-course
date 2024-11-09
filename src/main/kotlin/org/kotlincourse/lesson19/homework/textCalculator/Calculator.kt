package org.sergei.org.kotlincourse.lesson19.homework.textCalculator

class Calculator {
    private val operations = mutableListOf<Operation>()

    init {
        addOperation(Addition())
        addOperation(Subtraction())
        addOperation(Multiplication())
        addOperation(Division())
        addOperation(Modulus())
    }

    // Приватный метод для добавления новой операции
    private fun addOperation(operation: Operation) {
        operations.add(operation)
    }

    // Метод для выполнения вычисления
    fun calculate(expression: String): String {
        val operatorType = listOf("+", "-", "*", "/", "%").firstOrNull { expression.contains(it) }
            ?: return "Операция не найдена в выражении"
        val operands = splitExpression(expression, operatorType)
            ?: return "Ошибка в разбиении выражения на операнды"
        val operation = operations.firstOrNull { it.symbol == operatorType }
            ?: return "Операция невозможна для данных операндов"
        return operation.execute(operands)
    }

    // Вспомогательный метод для разбиения выражения на операнды
    private fun splitExpression(expression: String, operator: String): Pair<Double, Double>? {
        val parts = expression.split(operator)
        if (parts.size != 2) return null
        val operand1 = parts[0].trim().toDoubleOrNull() ?: return null
        val operand2 = parts[1].trim().toDoubleOrNull() ?: return null
        return Pair(operand1, operand2)
    }
}