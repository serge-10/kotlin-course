package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

// 2. Функция-расширение для класса Char?, которая принимает три аргумента
fun Char?.processChar(arg1: Int, arg2: Int, arg3: Boolean) {
    if (this != null) {
        println("Char: $this, Sum: ${arg1 + arg2}, Bool: $arg3")
    } else {
        println("Null Char, Sum: ${arg1 + arg2}, Bool: $arg3")
    }
}