package org.sergei.org.kotlincourse.lesson30.homework

// Создай enum с перечислением для светофора.
// Enum должен включать цвет из класса Colors, длительность сигнала duration и количество миганий blinkTimes (может быть null).
// Мигание нужно установить только для зелёного сигнала.
// Реализовать функцию с бесконечным циклом, которая будет выводить сигналы светофора в порядке:
// красный (4 сек), жёлтый (2 сек), зелёный (4 сек), зелёный мигающий (4 раза).
// Отображение сигнала выполняется через showSignal()
// Задержку между сигналами можно выполнить через Thread.sleep() в который передаётся задержка в миллисекундах.
// Мигание выполняется через попеременный вызов clear() и showSignal() с задержками между ними в 300мс

enum class Colors(val value: String) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m")
}

enum class TrafficLightSignal(val color: Colors, val duration: Int, val blinkTimes: Int?) {
    RED(Colors.RED_COLOR, 4, null),
    YELLOW(Colors.YELLOW_COLOR, 2, null),
    GREEN(Colors.GREEN_COLOR, 4, 4)
}

const val LIGHT_SYMBOL = "\u25CF"

// Функция для отображения сигнала
fun showSignal(signal: TrafficLightSignal) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
}

// Функция для очистки вывода
fun clear() {
    print("\r    ")
}

// Функция для бесконечного цикла работы светофора
fun startTrafficLight() {
    while (true) {
        // Красный сигнал
        showSignal(TrafficLightSignal.RED)
        Thread.sleep(TrafficLightSignal.RED.duration * 1000L)

        // Желтый сигнал
        showSignal(TrafficLightSignal.YELLOW)
        Thread.sleep(TrafficLightSignal.YELLOW.duration * 1000L)

        // Зеленый сигнал (обычный)
        showSignal(TrafficLightSignal.GREEN)
        Thread.sleep(TrafficLightSignal.GREEN.duration * 1000L)

        // Зеленый мигающий сигнал
        TrafficLightSignal.GREEN.blinkTimes?.let { blinkTimes ->
            repeat(blinkTimes) {
                clear()
                Thread.sleep(300L) // Задержка между миганиями
                showSignal(TrafficLightSignal.GREEN)
                Thread.sleep(300L)
            }
        }
    }
}

// Точка входа
fun main() {
    startTrafficLight()
}


