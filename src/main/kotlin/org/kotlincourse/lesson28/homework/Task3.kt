package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 3
// Создайте директорию workspace/task3/structure.
// Внутри директории structure создайте папку myDir
// с двумя вложенными поддиректориями subDir1 и subDir2.
// Проверьте, что myDir действительно содержит эти поддиректории.

fun main() {
    // Создаём директорию structure
    val structureDir = File("workspace/task3/structure").apply {
        mkdirs()
    }

    // Создаём директорию myDir внутри structure
    val myDir = File(structureDir, "myDir").apply {
        mkdirs()
    }

    // Создаём поддиректории subDir1 и subDir2 внутри myDir
    listOf("subDir1", "subDir2").forEach { subDirName ->
        File(myDir, subDirName).mkdirs()
    }

    // Проверяем, что поддиректории созданы
    val subDirsExist = myDir.listFiles()?.filter { it.isDirectory }?.map { it.name } ?: emptyList()
    println("Поддиректории в myDir: $subDirsExist")
    println("Все поддиректории созданы: ${subDirsExist.containsAll(listOf("subDir1", "subDir2"))}")
}

