package org.sergei.org.kotlincourse.lesson18.homework.Printer

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        processText(text)
        println() // Переход на новую строку после завершения вывода
    }

    override fun handleWord(word: String) {
        print("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET} ")
    }
}