package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 5
// Создайте файл workspace/task5/config/config.txt
// запишите в него список параметров (в формате ключ=значение),
// а затем прочитайте файл и выведите только значения.


fun main() {
    val configDir = File("workspace/task5/config/config.txt").apply {
        mkdirs()
    }
    val configFile = File(configDir, "config.txt")

    val paramets = listOf(
        "Ключ1 = Значение1",
        "Ключ2 = Значение2",
        "Ключ3 = Значение3",
        "Ключ4 = Значение4"
    )
    configFile.writeText(paramets.joinToString("\n"))

    val values = configFile.readLines().mapNotNull { it.split("=").getOrNull(1) }
    values.forEach { println(it) }
}