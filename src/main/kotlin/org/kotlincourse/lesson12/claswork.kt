package org.sergei.org.kotlincourse.lesson12

fun main(){
    // Вызов функции с примерами размеров
    org.sergei.printMap(10, -15)  // Карта 10x15
}
//fun  имяФункции(параметры): ТипВозвращаемогоЗначения{
//    //тело функции
//    return значения
//}

fun sayHello(){
    println("Hello, World")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun  multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

fun doumfing() = Unit

fun getuserName(): String{
    return ""
}

fun printgrit(grit: String){}

fun calcArea(area: Double, area1: Double): Double{
    return 9.0
}

fun findMax(ch1: Int, ch2: Int): Int{
    return  6
}

fun isNullor(n: String?): Boolean{
    return false
}

fun calculeidDisc(disc: List<String>, arg: Int?): Double?{
    return null
}

fun sum(first: Double, sec: Double, flag: Boolean): Double{

    return if (flag){
         first +sec
    }else {
         first - sec
    }
}

fun getmax(a: Int, b: Int): Int = if(a < b) b else a

fun printPositiNumbers(a: List<Int>){
    for (i in a) {
        if (i > 0) {
            println(i)
        } else return
    }
    println("конец")
}

fun repleyString(strings: MutableList<String>, str: String){
    for (i in strings.indices){
        if(strings[i] == str){
            strings[i] = str.uppercase()
            return
        }
    }
    println("Строка не нашлась")
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
