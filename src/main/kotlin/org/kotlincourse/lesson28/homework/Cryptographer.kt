package org.sergei.org.kotlincourse.lesson28.homework

import java.io.File

interface FileProcessor {
    fun findFilesByExtension(extension: String, directory: File): List<File>
    fun encryptFiles(files: List<File>, encryptor: Encryptor)
    fun moveToBackup(files: List<File>, backupDir: File)
}

interface Encryptor {
    fun encrypt(content: String): String
}

class FileProcessorImpl : FileProcessor {
    override fun findFilesByExtension(extension: String, directory: File): List<File> {
        return directory.walkTopDown().filter { it.isFile && it.extension == extension }.toList()
    }

    override fun encryptFiles(files: List<File>, encryptor: Encryptor) {
        files.forEach { file ->
            val content = file.readText()
            val encryptedContent = encryptor.encrypt(content)
            val encryptedFile = File(file.parent, file.nameWithoutExtension + ".encrypted")
            encryptedFile.writeText(encryptedContent)
        }
    }

    override fun moveToBackup(files: List<File>, backupDir: File) {
        files.forEach { file ->
            val relativePath = file.relativeTo(File(".")).path
            val backupFile = File(backupDir, relativePath)
            backupFile.parentFile.mkdirs()
            file.copyTo(backupFile, overwrite = true)
            file.delete()
        }
    }
}

class EncryptorImpl : Encryptor {
    override fun encrypt(content: String): String {
        val shift = 3
        return content.map {
            when (it) {
                in 'a'..'z' -> 'a' + (it - 'a' + shift) % 26
                in 'A'..'Z' -> 'A' + (it - 'A' + shift) % 26
                else -> it
            }
        }.joinToString("")
    }
}

class EncryptionManager(private val fileProcessor: FileProcessor, private val encryptor: Encryptor) {
    fun encryptFilesInDirectory(directory: File, backupDir: File, extension: String) {
        if (!directory.exists() || !directory.isDirectory) {
            throw IllegalArgumentException("The specified directory does not exist or is not a directory.")
        }

        if (!backupDir.exists()) {
            backupDir.mkdirs()
        }

        val files = fileProcessor.findFilesByExtension(extension, directory)
        fileProcessor.encryptFiles(files, encryptor)
        fileProcessor.moveToBackup(files, backupDir)
    }
}

fun main() {
    // Исходная директория и директория для бэкапа
    val sourceDirectory = File("test_files")
    val backupDirectory = File("backup")

    // Создаем процессор файлов и шифровальщик
    val fileProcessor = FileProcessorImpl()
    val encryptor = EncryptorImpl()

    // Создаем менеджер шифрования
    val encryptionManager = EncryptionManager(fileProcessor, encryptor)

    // Расширение файлов для шифрования
    val fileExtension = "txt"

    // Выполняем шифрование
    encryptionManager.encryptFilesInDirectory(sourceDirectory, backupDirectory, fileExtension)

    println("Шифрование завершено. Проверьте директорию backup.")
}
