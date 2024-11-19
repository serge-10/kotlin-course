package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

// 3. Функция-расширение для MutableList с дженериком

fun <T> MutableList<T>.updateOrRetrieve(element: T?, index: Int): T? {
    // Проверяем, находится ли индекс в пределах допустимых значений
    if (index in this.indices) {
        val oldValue = this[index]       // Сохраняем текущее значение по указанному индексу
        this[index] = element ?: oldValue  // Обновляем элемент списка, если новый элемент не null, иначе оставляем старое значение

        return oldValue         // Возвращаем старое значение
    } else {
        println("Index out of bounds")  // Если индекс вне границ списка, выводим сообщение об ошибке
        return null                     // Возвращаем null, так как обновление невозможно
    }
}


