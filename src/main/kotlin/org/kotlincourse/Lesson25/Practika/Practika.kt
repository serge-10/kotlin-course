package org.sergei.org.kotlincourse.Lesson25.Practika
fun main(){
    val function = fun() {
        println("Hello World")
    }

    val function1: () -> Unit = {
        println("Hello world")
    }

    val function2 = {
        println("Hello World")
    }

    val function3:(String) -> Int = {it ->
         it.length
    }

    val function4 = { arg: String ->
        arg.length
    }

    val function6 = fun String.(arg1: Int, arg2: Int): Boolean{
        println(this)
        println(arg1)
        println(arg2)
        return arg1 == arg2
    }

    val function61: String.(Int, Int) -> Boolean = { arg1,arg2 ->
        println(this)
        println(arg1)
        println(arg2)
         arg1 == arg2
    }
    println("hello World".function61(3,5))


    val function71 = fun (list: List<Int>): Int{
        return list.filter { it > 0 }.sum()
    }

    val function72: (List<Int>) -> Int = { list ->
        list.filter{ it > 0}.sum()
    }

    val function73 = {list: List<Int> ->
        list.filter {it > 0 }. sum()
    }

    val function81 = fun Set<Int>.(): Set<Int>{
        return filter{ it % 2 == 0 }.toSet()
    }

    val function82: Set<Int>.() -> Set<Int> = {
        filter { it % 2 == 0 }.toSet()
    }

    val set = setOf(1, 2, 3, 4)
    println(set.function82())

//    val function9 = fun <T>(arg: T){
//         ананнимную функцию с дженериком нельзя
//    }

}

fun function() {
    println("Hello World")
}

fun function3 (arg: String): Int{
    return arg.length
}

fun String.function6(arg1: Int, arg2: Int): Boolean{
    println(this)
    println(arg1)
    println(arg2)
    return arg1 == arg2
}

fun function7(list: List<Int>): Int{
    return list.filter { it > 0 }.sum()
}

fun Set<Int>.filterEven(): Set<Int>{
    return filter{ it % 2 == 0 }.toSet()
}

fun <T>function(arg: T){

}