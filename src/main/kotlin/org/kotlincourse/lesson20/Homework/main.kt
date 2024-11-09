package org.sergei.org.kotlincourse.lesson20.Homework

fun main() {
    // Создание объектов устройств
    val fridge = FridgeDevice()
    val washingMachine = WashingMachineDevice()
    val kettle = Kettle()
    val oven = Oven()

    // Холодильник
    println("\n--- Холодильник ---")
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.open()
    fridge.emitLight()
    fridge.programAction("Охлаждение")
    fridge.execute()
    fridge.close()
    fridge.powerOff()
    fridge.clean() // Проверка очистки при выключенном состоянии

    // Стиральная машина
    println("\n--- Стиральная машина ---")
    washingMachine.powerOn()
    washingMachine.fillWater(20)
    washingMachine.setTemperature(40)
    washingMachine.programAction("Стирка")
    washingMachine.setTimer(30)
    washingMachine.execute()
    washingMachine.drain()
    washingMachine.powerOff()

    // Чайник
    println("\n--- Чайник ---")
    kettle.powerOn()
    kettle.fillWater(1)
    kettle.setTemperature(90)
    kettle.programAction("Нагрев воды")
    kettle.execute()
    kettle.getWater(1)
    kettle.powerOff()

    // Духовка
    println("\n--- Духовка ---")
    oven.powerOn()
    oven.setTemperature(200)
    oven.programAction("Выпечка")
    oven.execute()
    oven.powerOff()
}
