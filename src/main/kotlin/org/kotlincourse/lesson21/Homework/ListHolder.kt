package org.sergei.org.kotlincourse.lesson21.Homework

class ListHolder<T>(private val list: MutableList<T>) {

    fun addElement(element: T) {         // Метод для добавления элемента в список.
        list.add(element)
    }

    fun getElements(): List<T> {         // Метод для получения всех элементов списка.
        return list                      // Возвращаем неизменяемую версию списка.
    }
}
