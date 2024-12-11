package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 4
// Создайте директорию workspace/task4/temp.
// Внутри директории temp создайте несколько вложенных файлов и директорий.
// Удалите директорию workspace/task4 со всем содержимым


fun main() {
    // Создаём директорию temp
    val tempDir = File("workspace/task4/temp").apply {
        mkdirs()
    }

    // Создаём файлы и поддиректории внутри temp
    File(tempDir, "file1.txt").writeText("Фаил 1")
    File(tempDir, "file2.txt").writeText("Фаил 2")
    File(tempDir, "subDir1").apply { mkdirs() }
    File(File(tempDir, "subDir1"), "file3.txt").writeText("фаил 3")
    File(tempDir, "subDir2").apply { mkdirs() }

    // Выводим список всех файлов и директорий в temp
    val files = tempDir.listFiles()
    files?.forEach { file ->
        println("Содержимое: ${file.name}")
    }

    // Удаляем workspace/task4 со всем содержимым
    val task4Dir = File("workspace/task4")
    if (task4Dir.deleteRecursively()) {
        println("Директория workspace/task4 удалена.")
    } else {
        println("Не удалось удалить директорию workspace/task4.")
    }
}

