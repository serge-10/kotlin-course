package org.sergei.org.kotlincourse.Lesson23

fun main(){
    val obj: Any = "Hello, World!"

    if (obj is String) {
        println("Объект является строкой")
    }

    if (obj !is Int) {
        println("Объект не является целым числом")
    }

    if (obj is String) {
        // obj автоматически приведён к String
        println(obj.uppercase()) // Метод toUpperCase() доступен, т.к. obj теперь String
    }
    val num: Any = 123
//    val str: Double = num as Double
//    println(str)


    val str: String = num as String
    val safeStr: String? = num as? String

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }

    val flyingCar = FlyingCar()

    checkCapabilities(flyingCar)

//    val i: Any = "jihd"
//    println(i as String)
//
////    println(i as Int)
//    if (i is String) {
//        println(i)
//    }else{
//        println("Is not Numbers")
//    }
//
//    println(i as? Int ?:"Is not Numbers")

    val str1 : Any = listOf("Hello", "World", "Kotlin")
//    println((str1 as List<Int>).get(0).toString())  // ошибка
    if (str1 is List<*>){
        (str1[0] as String).length
    }

    val str2 : String? = null
    println(str2 as? String)


}

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Едет как автомобиль")
    }

    override fun fly() {
        println("Летит как самолёт")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("Этот объект также может летать!")
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}
