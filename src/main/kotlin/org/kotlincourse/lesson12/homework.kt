package org.sergei.org.kotlincourse.lesson12

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    println(averageValue(numbers))  // Вывод: 3.0

    println(stringLength("Hello"))  // Вывод: 5
    println(stringLength(null))     // Вывод: null

}

    // Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun simple(){

}

    // Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun simpleSum(a: Int, b: Int): Int{
    return a +b
}

    // Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun strings(name: String){

}

    // Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun averageValue(numbers: List<Int>): Double {
    return numbers.average()
}
    // Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun stringLength(strings1: String?): Int? {
    return strings1?.length

}

    // Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun nullables(): Double?{
    return null
}

    // Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun listFun(listFun: List<Int>?){

}

    // Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
 fun stringsFun(x: Int): String? {
     return x.toString()
 }

    // Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun stringsFun2(): List<String>{
    return listOf()
}

    // Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun StringsFunInt(strings2: String?, c: Int? ): Boolean? {
    return null
}


    // Напиши рабочий код для следующих задач:

    // Задача 1:
    // Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(count: Int): Int {
    return count * 2
}

    // Задача 2:
    // Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(count2: Int): Boolean {
    return count2 % 2 == 0
}

    // Задача 3:
    // Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
    // Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    if (n < 1) return           // Если n меньше 1, прекращаем выполнение функции

    for (i in 1..n) {
        println(i)              // Выводим числа от 1 до n
    }
}

    // Задача 4:
    // Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
    // Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(listing: List<Int>): Int? {
    for (i in listing) {
        if (i < 0) {
            return i  // Возвращаем первое отрицательное число
        }
    }
    return null  // Если отрицательных чисел нет, возвращаем null
}

    // Задача 5:
    // Напишите функцию processList, которая принимает список строк.
    // Функция должна проходить по списку и выводить каждую строку.
    // Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(listing5: List<String?>) {
    for (i in listing5) {
        if (i == null) return  // Прекращаем выполнение, если встречается null
        println(i)  // Выводим строку
    }
}

