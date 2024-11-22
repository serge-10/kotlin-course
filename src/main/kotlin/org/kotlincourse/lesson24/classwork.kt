package org.sergei.org.kotlincourse.lesson24

import java.io.File
import java.lang.RuntimePermission as RuntimePermission1

fun main(){
//    throw Exception("Сообщение об ошибки")
//    val exception = Exception("Сообщение об ошибки")
//    throw exception

//    try {
//        var r = listOf(1)
//        r[2]
//        // Код, который может выбросить исключение
//    } catch (e: NullPointerException) {
//        // Обработка конкретного типа исключения
//    } catch (e: Exception) {
//        // Обработка всех остальных исключений
//    } finally {
//        // Блок, который выполняется всегда, независимо от наличия исключения
//    }

//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }
//    try {
//        val i: Double = "String" as Double
//
//    } catch(e: Throwable){
//        println("ClassCastException")
//    }

    val i  = "123rrr".toDouble()
    println(i)

    setage(-1)

    val file = File("jgyfyfyg")
    file.createNewFile()
    val i1 = file.inputStream()
    i1.close()

    try {
        val list = mutableListOf("")
        while (true) {
            list.add("djdjdjjd")
        }
    }catch (e: Throwable){
        println("нет памяти")
    }
    try {
        stack()
    }catch (e: Throwable){
        println("stakOverFlow")
    }


}

fun setage(age: Int){
    require(age >= 0){  // можно назвать check это похоже
        "Age возраст отрицательный"
    }
}

fun stack(){
    stack()
}

//class OrderExeption(message: String): RuntimePermission1(message){
//
//}