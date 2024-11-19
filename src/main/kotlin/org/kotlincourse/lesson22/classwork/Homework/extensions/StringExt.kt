package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions


// Задача 5: Кодер-декодер строк

fun String.encrypt(base: Int): String {
    // Преобразуем каждый символ строки: сдвигаем его на base позиций и преобразуем обратно в Char
    return map { (it + base).toChar() }
        // Соединяем все преобразованные символы в строку
        .joinToString("")
}

fun String.decrypt(base: Int): String {
    // Преобразуем каждый символ строки: сдвигаем его на base позиций назад и преобразуем обратно в Char
    return map { (it - base).toChar() }
        // Соединяем все преобразованные символы в строку
        .joinToString("")
}

