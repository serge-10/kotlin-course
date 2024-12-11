package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 7
// Создайте директорию workspace/task9/docs.
// Проверь, есть ли файл с именем readme.md.
// Если файла нет, создайте его и запишите текст "This is a README file."

fun main() {
    // Создаём директорию workspace/task9/docs
    val dir = File("workspace/task9/docs").apply {
        mkdirs()
    }

    // Создаём объект для файла readme.md в этой директории
    val readmeFile = File(dir, "readme.md")

    // Проверяем, существует ли файл
    if (readmeFile.exists()) {
        println("Файл ${readmeFile.absolutePath} уже существует.")
    } else {
        // Если файла нет, создаём его и записываем текст
        readmeFile.writeText("This is a README file.")
        println("Файл ${readmeFile.absolutePath} был создан.")
    }
}