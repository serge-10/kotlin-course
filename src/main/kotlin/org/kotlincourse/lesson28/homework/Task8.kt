package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

// Задача 8
// Создайте файлы
// workspace/task10/data/1/4/prod/data14.mysql
// workspace/task10/data/2/3/prod/data23.mysql
// workspace/task10/data/5/2/prod/data52.mysql
// Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data
// сохраняя структуру директорий. Для копирования используй метод copyTo

fun main() {
    // Создаём файлы с указанной структурой
    val file1 = File("workspace/task10/data/1/4/prod/data14.mysql").apply {
        parentFile.mkdirs()
        writeText("Содержимое файла data14.mysql")
    }
    val file2 = File("workspace/task10/data/2/3/prod/data23.mysql").apply {
        parentFile.mkdirs()
        writeText("Содержимое файла data23.mysql")
    }
    val file3 = File("workspace/task10/data/5/2/prod/data52.mysql").apply {
        parentFile.mkdirs()
        writeText("Содержимое файла data52.mysql")
    }

    // Путь к директории backup
    val backupDir = File("workspace/task10/backup")
    backupDir.mkdirs()

    // Копируем файлы в backup, сохраняя структуру директорий
    val dataDir = File("workspace/task10/data")
    dataDir.walkTopDown().filter { it.isFile }.forEach { file ->
        // Вычисляем относительный путь от data до текущего файла
        val relativePath = file.relativeTo(dataDir)
        // Создаём путь для копии файла в директории backup
        val backupFile = File(backupDir, relativePath.path)
        // Создаём директорию, если её нет
        backupFile.parentFile.mkdirs()
        // Копируем файл
        file.copyTo(backupFile, overwrite = true)
    }

    println("Копирование завершено. Структура сохранена.")
}
