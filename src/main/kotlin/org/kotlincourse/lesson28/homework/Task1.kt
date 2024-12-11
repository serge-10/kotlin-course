package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 1
//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

fun main() {

    File("workspace/task1/example.txt").apply{
        parentFile.mkdirs()
        writeText("Hello, Kotlin!")
        println(exists())
    }
}