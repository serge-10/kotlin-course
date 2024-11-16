package org.sergei.org.kotlincourse.lesson22.classwork.Homework

fun <T, R> Pair<T?,R?>.revert(): Pair<R?, T?> {
    return this.second to this.first
}