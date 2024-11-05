package org.sergei.org.kotlincourse.lesson18.homework.Printer

class LaserPrinter : Printer() {

    override fun printText(text: String) {
        processText(text) { word ->
            print("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET} ") // добавлен пробел после каждого слова
        }
        println() // Переход на новую строку после завершения вывода
    }
}