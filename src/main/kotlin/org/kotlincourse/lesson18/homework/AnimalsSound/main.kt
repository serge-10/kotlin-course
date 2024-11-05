package org.sergei.org.kotlincourse.lesson18.homework.AnimalsSound

// Животные и Их Звуки
//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    // Вызов метода makeSound() для каждого животного
    animals.forEach { it.makeSound() }
}