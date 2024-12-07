package org.sergei.org.kotlincourse.lesson27.Homework

// Функция для форматированного вывода информации об объекте Person
fun printPersonInfo(person: Person) {
    println("=== Информация о человеке ===")
    println("Имя: ${person.name}")
    println("Возраст: ${person.age}")
    println("Email: ${person.email}")
    println("=============================")
}

fun main() {
    // Использование apply для Employee
    val employee1 = Employee("Sergej", 44, "Безработный").apply {
        email = "vlasovseverin@gmail.com"
        department = "Черногория"
    }

    println("Задача на apply")
    println("Name: ${employee1.name}")
    println("Age: ${employee1.age}")
    println("Position: ${employee1.position}")
    println("Email: ${employee1.email}")
    println("Department: ${employee1.department}")

    // Использование also для Person
    val person2 = Person("Иван", 23).apply {
        email = "тестовый@gmail.com"
    }.also { printPersonInfo(it) }
}



