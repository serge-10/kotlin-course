package org.sergei.org.kotlincourse.lesson21.Homework

class StringValidator : Validator<String?> {

    override fun valid(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}