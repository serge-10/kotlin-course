package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

fun String.encrypt(base: Int): String {
    return map { (it + base).toChar() }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { (it - base).toChar() }.joinToString("")
}
