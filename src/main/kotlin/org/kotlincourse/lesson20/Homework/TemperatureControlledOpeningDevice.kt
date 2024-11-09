package org.sergei.org.kotlincourse.lesson20.Homework

abstract class TemperatureControlledOpeningDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    abstract override val maxTemperature: Int
    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Не могу установить температуру. Устройство выключено")
            return
        }
        if (temp <= maxTemperature) {
            currentTemperature = temp
            println("Установлена температура: $currentTemperature°C")
        } else {
            println("Температура превышает максимальную ($maxTemperature°C)")
        }
    }

    override fun open() {
        isOpen = true
        println("Устройство открыто")
    }

    override fun close() {
        isOpen = false
        println("Устройство закрыто")
    }
}
