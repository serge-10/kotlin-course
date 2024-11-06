package org.sergei.org.kotlincourse.lesson18.homework.Printer

class InkjetPrinter : Printer() {

    private val colorPairs = listOf(
        Pair(Colors.RED, Background.WHITE),
        Pair(Colors.GREEN, Background.BLACK),
        Pair(Colors.BLUE, Background.YELLOW),
        Pair(Colors.CYAN, Background.PURPLE),
        Pair(Colors.YELLOW, Background.BLUE)
    )

    private var index = 0

    override fun printText(text: String) {
        index = 0 // Сброс индекса перед печатью текста
        processText(text)
    }

    override fun handleWord(word: String) {
        val (textColor, bgColor) = colorPairs[index % colorPairs.size]
        print("$textColor$bgColor$word${Colors.RESET} ")
        index++
    }
}
