package org.sergei.org.kotlincourse.lesson22.classwork.Homework

// 4. Функция-расширение для словаря Map<K, List<K>>?, которая возвращает другой словарь
fun <T> Map<T, List<T>>?.returnMapGenericNull(arg: Number): Map<String, T?>? {
    if (this == null) return null
    val result = mutableMapOf<String, T?>()
    for ((key, value) in this) { // Перебираем словарь
        if (arg.toInt() in value.indices) { // Проверяем, входит ли индекс в границы списка
            result[key.toString()] = value[arg.toInt()] // Добавляем элемент списка
        } else {
            result[key.toString()] = null // Если индекс вне границ, добавляем null
        }
    }
    return result
}