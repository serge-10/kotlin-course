package org.sergei.org.kotlincourse.lesson18.homework.Printer

abstract class Printer {
    abstract fun printText(text: String)

    // Protected метод для разбивки текста на слова и обработки каждого слова
    protected fun processText(text: String, action: (String) -> Unit) {
        val words = text.split(" ")
        for (word in words) {
            action(word)
        }
    }
}