package org.sergei.org.kotlincourse.lesson21.Homework

interface Mapper<T, R> {
    fun transformation(element:T):R             // Метод transformation в интерфейсе принимает элемент типа T
                                                // и возвращает результат преобразования типа R

    fun transformList(elementList: List<T>): List<R>
}

