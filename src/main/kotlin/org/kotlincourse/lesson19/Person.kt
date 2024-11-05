package org.sergei.org.kotlincourse.lesson19

open class Person(private val name: String, protected val age: Int) {

    // Публичный метод
    fun greet() {
        println("Привет, меня зовут $name.")
    }

    // Защищённый метод
    protected fun getName(): String {
        return name
    }

    // Приватный метод
    private fun secret() {
        println("Это секретный метод.")
    }
}