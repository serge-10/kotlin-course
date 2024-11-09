package org.sergei.org.kotlincourse.lesson20.Homework

abstract class TemperatureControlledOpenableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    abstract override val maxTemperature: Int
    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    // Реализация методов TemperatureRegulatable
    override fun setTemperature(temp: Int) {
        if (temp <= maxTemperature) {
            currentTemperature = temp
            println("Установлена температура: $currentTemperature°C")
        } else {
            println("Ошибка: Температура превышает максимально допустимую ($maxTemperature°C)")
        }
    }

    // Реализация методов Openable
    override fun open() {
        isOpen = true
        println("Девайс открыт")
    }

    override fun close() {
        isOpen = false
        println("Девайс закрыт")
    }
}
