package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 2
//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.

fun main() {

    File("workspace/task2/testDir").apply{
        mkdirs()
        println(isDirectory)
        println(absolutePath)
    }
}