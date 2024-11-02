package org.sergei.org.kotlincourse.lesson18.homework.AnimalsSound

class Cat: Animal() {
    override fun makeSound() {
        println("${Colors.GREEN}Meow${Colors.RESET}")
    }
}