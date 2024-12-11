package org.sergei.org.kotlincourse.lesson28.homework

// Задача 6
// Пройди по всем вложенным директориям workspace и выведи в консоль
// сначала пути директорий, а потом пути файлов

import java.io.File

fun main() {
    val workspaceDir = File("workspace")

    if (workspaceDir.exists() && workspaceDir.isDirectory) {
        val directories = mutableListOf<File>()
        val files = mutableListOf<File>()

        // Рекурсивный обход директорий и файлов
        workspaceDir.walk().forEach {
            if (it.isDirectory) {
                directories.add(it)
            } else if (it.isFile) {
                files.add(it)
            }
        }

        // Вывод путей директорий
        println("Директории:")
        directories.forEach { println(it.absolutePath) }

        // Вывод путей файлов
        println("\nФайлы:")
        files.forEach { println(it.absolutePath) }
    } else {
        println("Директория 'workspace' не существует или не является директорией.")
    }
}
