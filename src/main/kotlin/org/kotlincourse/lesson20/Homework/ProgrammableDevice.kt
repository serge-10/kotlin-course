package org.sergei.org.kotlincourse.lesson20.Homework

abstract class ProgrammableDevice : PoweredDevice(), Programmable {
    private val actions = mutableListOf<String>()

    override fun programAction(action: String) {
        actions.add(action)
        println("Программируем действие: $action")
    }

    override fun execute() {
        println("Выполнение запрограммированных действий:")
        actions.forEach { action ->
            println(" - Выполнение действия: $action")
        }
        actions.clear()  // Очистка списка после выполнения
    }
}
