package org.sergei.org.kotlincourse.lesson20.Homework

class WashingMachineDevice : TemperatureControlledOpeningDevice(), WaterContainer, Drainable, Timable {
    override val maxTemperature: Int = 90
    override val capacity: Int = 50
    private var currentWaterLevel: Int = 0

    override fun fillWater(amount: Int) {
        currentWaterLevel = minOf(currentWaterLevel + amount, capacity)
        println("Заполняем воду в стиральную машину: текущий уровень $currentWaterLevel л")
    }

    override fun getWater(amount: Int) {
        currentWaterLevel = maxOf(currentWaterLevel - amount, 0)
        println("Сливаем воду из стиральной машины: текущий уровень $currentWaterLevel л")
    }

    override fun connectToDrain() {
        println("Подключение стиральной машины к сливу")
    }

    override fun drain() {
        println("Слив воды из стиральной машины")
    }

    override fun setTimer(time: Int) {
        println("Таймер установлен на $time минут")
    }

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Не могу установить программу. Стиральная машина выключена")
            return
        }
        super.programAction(action)
    }
}
