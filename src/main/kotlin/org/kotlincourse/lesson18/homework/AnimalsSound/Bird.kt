package org.sergei.org.kotlincourse.lesson18.homework.AnimalsSound

class Bird: Animal() {
    override fun makeSound() {
        println("${Colors.BLUE}Tweet${Colors.RESET}")
    }
}