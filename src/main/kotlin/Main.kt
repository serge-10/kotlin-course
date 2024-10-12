package org.sergei

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }

    // Вызов функции с примерами размеров
    printMap(10, -15)  // Карта 5x5


}

private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun createRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size  // Диапазон от 0 до положительного значения
    } else {
        0 downTo size  // Диапазон от 0 до отрицательного значения
    }
}

// Форматирование и печать строки с числами (оси или элементы карты)
private fun printFormattedLine(values: IntProgression, formatterSize: Int) {
    for (i in values) {
        print("%${formatterSize}s".format(i))
    }
    println()
}

// Форматирование и печать одного значения на карте
private fun getMapSymbol(i: Int, j: Int): String {
    val m = i * j
    return when {
        m % 2 == 0 -> if (m % 3 == 0) "." else "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}

// Печать одной строки карты
private fun printMapRow(i: Int, xRange: IntProgression, formatterSize: Int) {
    print("%${formatterSize}s".format(i))  // Печать заголовка для Y
    for (j in xRange) {
        val result = getMapSymbol(i, j)
        print("%${formatterSize}s".format(result))
    }
    println()
}

// Основная функция для печати карты
fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")

    val formatterSize = " $xSize".length

    val xRange = createRange(xSize)  // Диапазон по оси X (положительные значения)
    val yRange = createRange(-ySize)  // Диапазон по оси Y (отрицательные значения)

    // Печать заголовков по оси X
    print(" ".repeat(formatterSize))
    printFormattedLine(xRange, formatterSize)

    // Печать строк карты
    for (i in yRange) {
        printMapRow(i, xRange, formatterSize)
    }
}





