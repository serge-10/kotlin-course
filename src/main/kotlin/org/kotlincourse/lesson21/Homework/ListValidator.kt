package org.sergei.org.kotlincourse.lesson21.Homework



class ListValidator<T: Number> : Validator<List<Number?>> {

    override fun valid(value: List<Number?>): Boolean {
        return value.all { it != null && (it.toDouble() != 0.0) }
    }
}