package org.sergei.org.kotlincourse.lesson20.Homework

class Oven : TemperatureControlledOpeningDevice() {
    override val maxTemperature: Int = 250

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Не могу установить температуру. Духовка выключена")
            return
        }
        super.setTemperature(temp)
    }

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Не могу установить программу. Духовка выключена")
            return
        }
        super.programAction(action)
    }
}
