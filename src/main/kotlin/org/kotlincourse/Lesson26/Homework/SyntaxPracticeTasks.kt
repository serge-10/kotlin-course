package org.sergei.org.kotlincourse.Lesson26.Homework

// Задания на отработку синтаксиса,

// Напишите функцию, которая принимает другую функцию без аргументов
// и возвращаемого значения.

fun function1(
    arg: () -> Unit
){
}

// Создайте функцию,
// принимающую функцию с одним аргументом типа Int и возвращающую String.

fun function2 (
    arg: (Int)-> String
){
}

// Реализуйте функцию, принимающую функцию расширения типа Int,
// принимающую String и возвращающую Boolean.

fun function3(
    arg: Int.(String) -> Boolean
){
}

// Напишите функцию,которая принимает функцию с двумя аргументами типа
// Double и возвращает Boolean.
fun function4 (
    argDouble: (arg1:Double, arg2: Double) -> Boolean
){
}

// Напишите функцию, которая принимает функцию с одним аргументом-дженериком T
// и возвращает List<T>

fun <T> function5 (
    arg: (T) -> List<T>
){
}

// Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию,
// принимающую Int и возвращающую Boolean.

fun function6(
    arg: (String) -> ((Int) -> Boolean)
){
}

// Напишите функцию, которая принимает список чисел, множество строк,
// функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.

fun function7(
    list: List<Number>,
    set: Set<String>,
    arg: (List<Int>, Set<String>) -> Map<String,Int>
){
}

// Напишите функцию, возвращающую строку, принимающую число и функцию,
// принимающую число и возвращающую строку

fun function8(
    num: Number,
    argReturn: ((Number) -> String) -> String
): String {
    return argReturn { it.toString() }
}

// Напишите функцию, принимающую функцию,
// которая возвращает функцию без аргументов и возвращаемого значения.

fun function9(
    arg: (() -> () -> Unit) -> Unit
){
}