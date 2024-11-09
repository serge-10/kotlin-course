package org.sergei.org.kotlincourse.lesson20.Homework

class Kettle : TemperatureControlledOpeningDevice(), WaterContainer {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2
    private var currentWaterLevel: Int = 0

    override fun fillWater(amount: Int) {
        currentWaterLevel = minOf(currentWaterLevel + amount, capacity)
        println("Заполняем чайник водой: текущий уровень $currentWaterLevel л")
    }

    override fun getWater(amount: Int) {
        currentWaterLevel = maxOf(currentWaterLevel - amount, 0)
        println("Выливаем воду из чайника: текущий уровень $currentWaterLevel л")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Не могу установить температуру. Чайник выключен")
            return
        }
        super.setTemperature(temp)
    }

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Не могу установить программу. Чайник выключен")
            return
        }
        super.programAction(action)
    }
}
