package org.sergei.org.kotlincourse.lesson21.Homework

class OddValidator : Validator<Int> {

    override fun valid(value: Int): Boolean {
        return value % 2 == 0
    }
}