package org.sergei.org.kotlincourse.lesson18.homework.Logger

class Logger {
    // Базовый метод log с префиксом INFO
    fun log(message: String) {
        println("${Colors.GREEN}INFO: $message${Colors.RESET}")
    }

    // Перегруженный метод log с уровнем логирования
    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("${Colors.YELLOW}WARNING: $message${Colors.RESET}")
            "ERROR" -> println("${Colors.WHITE}${Colors.RED}ERROR: $message${Colors.RESET}")
            else -> println("${Colors.GREEN}$level: $message${Colors.RESET}")
        }
    }

    // Перегруженный метод log для списка сообщений
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    // Перегруженный метод log для объектов Exception
    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Unknown error")
    }
}