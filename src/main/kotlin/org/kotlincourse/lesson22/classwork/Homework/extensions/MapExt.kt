package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

// 4. Функция-расширение для словаря Map<K, List<K>>?, которая возвращает другой словарь
fun <T> Map<T, List<T>>?.returnMapGenericNull(arg: Number): Map<String, T?>? {
    if (this == null) return null // Если словарь null, возвращаем null
    val result = mutableMapOf<String, T?>() // Создаем результирующий словарь
    for ((key, value) in this) { // Перебираем словарь
        result[key.toString()] = value.getOrNull(arg.toInt()) // Добавляем элемент списка или null
    }
    return result // Возвращаем результат
}
