package org.sergei.org.kotlincourse.lesson18.homework.AnimalsSound

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    // Вызов метода makeSound() для каждого животного
    animals.forEach { it.makeSound() }
}