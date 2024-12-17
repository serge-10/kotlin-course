package org.sergei.org.kotlincourse.lesson30

enum class Seasons(val firstMonthName:String, val isVolatileDuration:Boolean = false ) {
    WINTER("december", true),
    SPRING("march" ),
    SUMMER("june" ),
    AUTUMN("september" ),
    ;

    fun printInfo(){
        println("В $this первый месяц $firstMonthName сезон ${if(isVolatileDuration )" с изменяемой " else "не изменяемой"} продолжительностью")
    }
    companion object{
        fun dettektSeason(firstMonthName1: String): Seasons{
           return entries.firstOrNull { it.firstMonthName == firstMonthName1 } ?:throw IllegalArgumentException("") }
    }
}

fun main() {
    Seasons.SPRING.printInfo()
    Seasons.WINTER.printInfo()

    println(Seasons.dettektSeason("december"))
    println(Seasons.dettektSeason("august"))

    HomeDevices.FRIDGE.fction()
    HomeDevices.WASHER.fction()
    HomeDevices.TV.fction()
}
interface HasValue{
    val value: String
}

interface HaesAction{
    fun fction()
}

enum class HomeDevices( val value1: String): HasValue, HaesAction{
    FRIDGE ("Холодильник") {
        override fun fction() {
            println("Заморозка")
        }

        override val value: String
            get() = TODO("Not yet implemented")
    },
    WASHER ("Стиралка") {
        override fun fction() {
            println("Стираю")

        }

        override val value: String
            get() = TODO("Not yet implemented")
    },
    TV ("Телевизор") {
        override val value: String
            get() = TODO("Not yet implemented")
    },
    ;

    override fun fction() {
        println("Turning off $value")
    }
}

fun example(interface1: HasValue){
    interface1.value
}