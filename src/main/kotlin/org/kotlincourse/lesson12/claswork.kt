package org.sergei.org.kotlincourse.lesson12

fun main(){

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

private fun checksize(xy: Int, result: String){
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun creatRange(size:Int): IntProgression {
    return  if (size > 0) {
        0..size
    } else {
        0 downTo size
    }

}

fun printMap(xSize: Int, ySize: Int) {
    checksize(xSize, "xSize")
    checksize(ySize, "ySize")

    val formatterSize = " $xSize".length

    val xRange = creatRange(xSize)
    val yRange = creatRange(ySize)


    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}