package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

// 3. Функция-расширение для MutableList с дженериком
fun <T> MutableList<T>.updateOrRetrieve(element: T?, index: Int): T? {
    if (index in this.indices) {
        val oldValue = this[index]
        this[index] = element ?: oldValue
        return oldValue
    } else {
        println("Index out of bounds")
        return null
    }
}
