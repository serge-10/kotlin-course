package org.sergei.org.kotlincourse.lesson30

object NumsObject {

    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

enum class Nums {
    ONE,
    TWO,
    THREE
}

fun main() {
    val t: Nums = Nums.ONE
    println(Nums.ONE)
    for (i in Nums.entries){
        println(i)
    }
}

fun printNum(num: Nums) {
    when(num) {
        Nums.ONE -> println(1)
        Nums.TWO -> TODO()
        Nums.THREE -> TODO()
    }
}

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if(isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }
}

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}
