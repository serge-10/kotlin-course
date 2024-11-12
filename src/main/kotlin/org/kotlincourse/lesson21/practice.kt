package org.sergei.org.kotlincourse.lesson21

// Класс BoxAny, который принимает любой тип данных (непараметризованный)
class BoxAny(private val item: Any) {
    // Метод для получения значения item
    fun getItem(): Any {
        return item
    }
}

// Параметризованный класс Box, который принимает тип T
class Box<T>(private val item: T) {
    // Метод для получения значения item
    fun getItem(): T {
        return item
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42

    printItem("Hello")    // Элемент: Hello
    printItem(123)        // Элемент: 123
    printItem(3.14)       // Элемент: 3.14

    println(sum(5, 10))       // 15.0
    println(sum(3.5, 2.5))    // 6.0
}

// Функция сложения, принимающая два числа и возвращающая их сумму в виде Double
fun <T: Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

// Универсальная функция для печати элемента
fun <T> printItem(item: T) {
    println("Элемент: $item")
}

// Итератор, который повторяет каждый элемент Iterable указанное число раз
class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {
    // Метод для печати элементов с повторением
    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

// Параметризованный класс Container, содержащий элемент item типа T
class Container<T>(val item: T)

// Параметризованный класс PairBox, содержащий два элемента разных типов
class PairBox<A, B>(val first: A, val second: B)

// Класс с ограничением по типу Number для item
class LimitedContainer<A: Number>(val item: A?)

// Интерфейс хранилища для хранения и получения значения типа T
interface Storage<T> {
    fun get(): T
    fun set(item: T)
}

// Интерфейс трансформера для преобразования типа A в тип B
interface Transformer<A, B> {
    fun transform(item: A): B
}

// Универсальная функция для обмена двух элементов в списке
fun <Q> swap(list: MutableList<Q>, index1: Int, index2: Int): List<Q> {
    val temp = list[index1]
    list[index1] = list[index2]
    list[index2] = temp
    return list
}

// Универсальная функция для объединения двух списков
fun <W> second(list1: List<W>, list2: List<W>): List<W> {
    return list1 + list2
}

// Функция преобразования двух списков в карту
fun <R, T> toMap(keys: List<R>, values: List<T>): Map<R, T> {
    return keys.zip(values).toMap()
}
