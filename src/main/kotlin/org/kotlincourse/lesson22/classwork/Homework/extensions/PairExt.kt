package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions

//Задача 3: Переворот элементов пары
fun <T, R> Pair<T?, R?>.revert(): Pair<R?, T?> {
    // Обмениваем местами элементы пары:
    // this.second становится первым элементом,
    // this.first становится вторым элементом.
    return this.second to this.first
}
