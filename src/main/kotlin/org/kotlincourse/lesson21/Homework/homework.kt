package org.sergei.org.kotlincourse.lesson21.Homework

// Требуется описать класс, интерфейс или функцию и реализовать предложенную логику в коде.

// Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
// которая будет создавать карту из списков ключей и значений.
// Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val result = mutableMapOf<K, V>()        // Создаем пустую изменяемую карту (MutableMap) для хранения ключей и значений
    val size = minOf(keys.size, values.size)  // Определяем минимальный размер между `keys.size` и `values.size`

    for (i in 0 until size) {           // На каждой итерации добавляем в `result` пару `key[i]` — `value[i]`,
        result[keys[i]] = values[i]          // где `keys[i]` — ключ, а `values[i]` — значение.
    }

    return result                           // Возвращаем результат в виде неизменяемой карты (Map).
}

// Напишите функцию getMiddleElement<T>(list: List<T>): T?,
// которая будет возвращать средний элемент списка, если он существует.

fun <T>getMiddleElement(list: List<T>): T?{
    return if(list.isNotEmpty())         // Проверяем, что список не пустой.
        list[list.size / 2] else null    // Если список не пустой, возвращаем элемент, находящийся посередине.
                                         // Если список пустой, возвращаем `null`.
}
