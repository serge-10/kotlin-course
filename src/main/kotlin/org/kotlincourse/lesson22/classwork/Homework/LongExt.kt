package org.sergei.org.kotlincourse.lesson22.classwork.Homework

// 5. Функция-расширение для Long?, возвращающая строку
fun Long?.toFormattedString(): String {
    return this?.let { "Long value: $it" } ?: "Null Long"
}