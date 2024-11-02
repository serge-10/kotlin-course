package org.sergei.org.kotlincourse.lesson18.homework.Printer

class InkjetPrinter : Printer() {

    private val colorPairs = listOf(
        Pair(Colors.RED, Background.WHITE),
        Pair(Colors.GREEN, Background.BLACK),
        Pair(Colors.BLUE, Background.YELLOW),
        Pair(Colors.CYAN, Background.PURPLE),
        Pair(Colors.YELLOW, Background.BLUE)
    )

    override fun printText(text: String) {
        var index = 0
        processText(text) { word ->
            val (textColor, bgColor) = colorPairs[index % colorPairs.size]
            print("$textColor$bgColor$word${Colors.RESET}")
            index++
        }
    }
}
