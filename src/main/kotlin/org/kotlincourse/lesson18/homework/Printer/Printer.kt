package org.sergei.org.kotlincourse.lesson18.homework.Printer

abstract class Printer {
    abstract fun printText(text: String)

    // Protected метод для разбивки текста на слова и вызова метода handleWord для каждого слова
    protected fun processText(text: String) {
        val words = text.split(" ")
        for (word in words) {
            handleWord(word)
        }
    }

    // Метод для обработки каждого слова, который нужно переопределить в подклассах
    protected open fun handleWord(word: String) {
        // По умолчанию ничего не делает, реализация будет в подклассах
    }
}