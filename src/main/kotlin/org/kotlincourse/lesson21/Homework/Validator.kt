package org.sergei.org.kotlincourse.lesson21.Homework

interface Validator<T> {
    fun valid(value:T): Boolean
}