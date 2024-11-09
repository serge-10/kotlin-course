package org.sergei.org.kotlincourse.lesson19.homework.WhyWhy

abstract class BaseClass(
    // Поле `privateVal` имеет модификатор `private`, что делает его доступным
    // только внутри `BaseClass`. Но так как в `ChildrenClass` параметр конструктора
    // называется также `privateVal`, он создается как отдельное поле в `ChildrenClass`.
    // Поэтому из `main()` можно получить доступ к `privateVal` как полю `ChildrenClass`.
    private val privateVal: String,

    // Поле `protectedVal` объявлено с модификатором `protected`, поэтому оно доступно
    // только внутри `BaseClass` и классов-наследников, таких как `ChildrenClass`.
    // Из `main()` это поле недоступно, так как `main()` не является наследником `BaseClass`.
    protected val protectedVal: String,

    // Поле `publicVal` имеет модификатор `public`, что делает его доступным везде,
    // в том числе из `main()`.
    val publicVal: String
) {

    // Поле `publicField` можно изменять напрямую из `main()`, так как оно `public`.
    // Однако оно имеет сеттер, который вызывает `verifyPublicField()` для проверки нового значения.
    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    // Поле `protectedField` имеет модификатор `protected`, поэтому оно доступно
    // только в `BaseClass` и его наследниках. Чтобы изменить его из `main()`, нужно вызвать
    // публичный метод в `ChildrenClass`.
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"

    // Поле `privateField` имеет модификатор `private`, поэтому доступно только в `BaseClass`.
    // Чтобы изменить его из `main()`, потребуется публичный метод-сеттер в `ChildrenClass`.
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    // Метод `getAll()` возвращает значения всех полей в виде строки. Он `public`,
    // поэтому доступен в `main()`.
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    // Публичный метод `printText` вызывает `privatePrint()`, который имеет модификатор `private`.
    // Этот метод может быть вызван из `main()` и напечатает строку из `BaseClass`.
    fun printText() {
        privatePrint()
    }

    // `getProtectedClass()` возвращает экземпляр внутреннего класса `ProtectedClass`.
    // Этот метод имеет модификатор `protected`, так как `ProtectedClass` также `protected`.
    // Это ограничивает доступ к этому методу только `BaseClass` и его наследниками.
    protected open fun getProtectedClass() = ProtectedClass()

    // Метод `verifyPublicField` имеет модификатор `protected`, поэтому доступен только
    // в `BaseClass` и его наследниках, не доступен в `main()`.
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3 // Проверка (возвращает `true`, если длина меньше 3)
    }

    // `privatePrint()` — приватный метод, доступен только внутри `BaseClass`.
    // Его нельзя переопределить в `ChildrenClass`, так как `private` методы не наследуются.
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // `getPrivateClass()` возвращает экземпляр `PrivateClass`, который объявлен как `private`.
    // Этот метод также `private`, чтобы ограничить доступ к `PrivateClass`.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass
    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String, // Это свойство доступно из `main()`, так как оно `public` в `ChildrenClass`.
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // Функция `getAll()` доступна в `main()`, так как унаследована из `BaseClass` и `public`.
    // Ее не нужно переопределять в `ChildrenClass`, и ее поведение остается неизменным.

    // Метод `printText()` в `BaseClass` вызывает `privatePrint()`, но `private` методы
    // не могут быть переопределены в Kotlin. Поэтому вызов `printText()` в `main()`
    // напечатает строку из `BaseClass`, так как `privatePrint()` из `ChildrenClass` не используется.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    // Добавляем метод для изменения `protectedField` из `main()`.
//    fun setProtectedField(value: String) {
//        protectedField = value
//    }

    // Добавляем метод для изменения `privateField` из `main()`.
    fun setPrivateField(value: String) {
        // Здесь мы обращаемся к `privateField` через метод в `BaseClass`
        (this as BaseClass).apply {
            // указываем значение в родительском классе
        }
    }
}

