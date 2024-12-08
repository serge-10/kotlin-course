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
    // Создайте объект Employee и используйте apply для инициализации его полей email и department.
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

    // Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
    // Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.
    val person2 = Person("Иван", 23).apply {
        email = "тестовый@gmail.com"
    }.also { printPersonInfo(it) }

    // Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee,
    // указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.

    val person3 = Person("Пётр", 31).apply {
        email = "тестовый@mail.ru"
    }.also { printPersonInfo(it) }

    val additionalPosition = with(person3) {
        Employee(name, age, "Менеджер")
    }
    println(additionalPosition.name)
    println(additionalPosition.age)
    println(additionalPosition.position)

    // Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee,
    // добавить ему email и department с помощью apply, вернуть инициализированный объект.

    val person4 = Person("Лев", 19).run {
        Employee(name,age,"Черногория").apply {
            email = "тестовый2@gmail.com"
            department = "Черногория"
        }
    }
    println("задача на run")
    println(person4.name)
    println(person4.age)
    println(person4.email)
    println(person4.department)


    // Создайте функцию, которая принимает объект класса Person?,
    // который может быть null. В функции используйте функцию let для создания Employee,
    // только если объект Person не null. В противном случае возвращается null

    // Пример с непустым Person
    val person5 = Person("Иван", 30).apply { email = "ivan@example.com" }
    val employee5 = createEmployee(person5)
    println("Employee 1: ${employee1?.name}, ${employee1?.age}, ${employee1?.position}, ${employee1?.email}")

    // Пример с null
    val person6: Person? = null
    val employee2 = createEmployee(person2)
    println("Employee 2: $employee2") // Должно вывести null
}


// Функция для создания Employee из Person?
fun createEmployee(person: Person?): Employee? {
    return person?.let {
        // Используем свойства объекта person для создания Employee
        Employee(it.name, it.age, "Сотрудник").apply {
            email = it.email
        }
    }
}
