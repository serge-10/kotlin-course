package org.sergei.org.kotlincourse.lesson11

import com.sun.jdi.Value

fun main(){

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    val emtyMap: Map<String, String> = mapOf()

    val capitals = mapOf(
        "Россия" to "Москва"
    )

    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val capitalOfRussia = capitals["Россия"]

    mutableCapitals["Германия"] = "Берлин"

    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals){
        println("${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }


    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    //работа

    val myMap = mapOf<String, Int>()
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    val myfavoriteMap = mutableMapOf(1 to "a")

    myfavoriteMap[34] = "asd"

    println(myfavoriteMap[1])       // a
    println(myfavoriteMap[55])      //null

    myfavoriteMap.remove(34)

    for (entries in myLovingMap){
        println("${entries.key}:${entries.value}")
    }

    for ((key, value) in myLovingMap){
        println("$key: $value")
    }

    val myOneMap: Map<String, List<Int>> = mapOf("st" to listOf(1, 2, 3))

    val daysMap = mapOf<String, List<String>>()

    val planMap = mapOf<String, MutableMap<String, String>>()
    val mapOfGame = mapOf<String, MutableSet<String>>()

}
fun serchKey(myMap: Map<String, String>, word:String):String{
    for ((key, value) in myMap){
        if (value == word) return key
    }
    return "Ошибка"

}
