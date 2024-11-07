package org.sergei.org.kotlincourse.lesson19.homework.WhyWhy

fun main() {
    // Создаем экземпляр класса ChildrenClass
    val child = ChildrenClass(
        privateVal = "значение privateVal",
        protectedVal = "значение protectedVal",
        publicVal = "значение publicVal"
    )

    // Проверяем значения полей через метод getAll()
    println("Начальные значения полей:")
    println(child.getAll())

    // Доступ к полю publicVal возможен напрямую, так как оно публичное
    println("\nЗначение publicVal: ${child.publicVal}")

    // Поле privateVal также доступно напрямую, так как оно объявлено как val в конструкторе ChildrenClass
    // (в отличие от private поля родительского класса, которое недоступно).
    println("Значение privateVal: ${child.privateVal}")

    // Поле publicField можно изменять из main, так как оно публичное
    child.publicField = "Антонио Бандерас"
    println("\nЗначение publicField после изменения: ${child.publicField}")

    // Поле protectedField изменить напрямую нельзя, так как оно `protected`
    // Однако, мы можем изменить его через метод setProtectedField() в ChildrenClass.
    child.setProtectedField("Новое значение для protectedField")
    println("\nЗначение protectedField после изменения через setProtectedField():")
    println(child.getAll())  // Выводит все поля, включая обновленное protectedField

    // Поле privateField недоступно напрямую из main, так как оно `private` в BaseClass
    // Но мы можем изменить его через метод setPrivateField() в ChildrenClass
    child.setPrivateField("Новое значение для privateField")
    println("\nЗначение privateField после изменения через setPrivateField():")
    println(child.getAll())

    // Проверяем вызов метода printText()
    println("\nВызов printText():")
    child.printText()
    // Результат вызова - печать из BaseClass, так как метод privatePrint() не переопределен в ChildrenClass.
}
