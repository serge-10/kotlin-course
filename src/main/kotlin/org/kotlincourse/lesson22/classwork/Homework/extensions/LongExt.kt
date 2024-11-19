package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

// 5. Функция-расширение для Long?, возвращающая строку
fun Long?.toFormattedString(): String {
    // Если значение не null, форматируем его как строку, иначе возвращаем "Null Long"
    return this?.let { "Long value: $it" } ?: "Null Long"
}
