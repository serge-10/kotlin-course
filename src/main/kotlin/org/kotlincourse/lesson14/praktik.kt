package org.sergei.org.kotlincourse.lesson14

fun main() {

    val map = mapOf<String, Int>()
    for (entry in map.entries) {
        println("${entry.key} =  ${entry.value}")
    }

    println(map.values)
    println(map.keys)

    val mapProducCount = mapOf<String, Int>()
    println(mapProducCount.getOrElse("apple") { throw Exception("not apple") })
    println(mapProducCount.containsKey("apple"))
    println(mapProducCount.containsValue(10))

    val listFruut = mapProducCount.map { "Продук ${it.key}   стоит ${it.value}" }


    println(mapProducCount.isEmpty())
    println(mapProducCount.isNotEmpty())

    val allTens = mapProducCount.all { it.value > 10 }

    val moreThan = mapProducCount.any { it.value > 100 }

    val moreProd = mapProducCount.filterValues { it > 100 }



    val mutableProductc = mapProducCount.toMutableMap()

    mutableProductc.remove("pinepple")
    mutableProductc.putAll(mapOf())

    mutableProductc.clear()

}