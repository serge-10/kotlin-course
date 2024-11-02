package org.sergei.org.kotlincourse.lesson18.homework.Logger

fun main() {
    val logger = Logger()

    // Логирование обычного сообщения
    logger.log("This is an informational message.")

    // Логирование сообщения с уровнем WARNING
    logger.log("WARNING", "This is a warning message.")

    // Логирование сообщения с уровнем ERROR
    logger.log("ERROR", "This is an error message.")

    // Логирование списка сообщений
    logger.log(listOf("First message", "Second message", "Third message"))

    // Логирование исключения
    try {
        throw IllegalArgumentException("An error occurred!")
    } catch (e: Exception) {
        logger.log(e)
    }
}