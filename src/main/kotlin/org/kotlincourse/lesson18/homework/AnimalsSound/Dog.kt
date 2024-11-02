package org.sergei.org.kotlincourse.lesson18.homework.AnimalsSound

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.RED}Bark${Colors.RESET}")
    }
}