package org.sergei.org.kotlincourse.lesson12

import org.sergei.org.kotlincourse.lesson5.result

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    println(averageValue(numbers))  // Вывод: 3.0

    println(stringLength("Hello"))  // Вывод: 5
    println(stringLength(null))     // Вывод: null


    drawRectangle(8, 9) // Рисует прямоугольник 5 на 3

    printMap(5, 5) // Пример вызова функции

}

    // Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun simple(){

}

    // Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun simpleSum(a: Int, b: Int): Int{
    return a + b
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

fun multiplyByTwo(count: Int) = count * 2

    // Задача 2:
    // Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(count2: Int) = count2 % 2 == 0


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
        if (i == null) return        // Прекращаем выполнение, если встречается null
        println(i)                   // Выводим строку
    }
}


// Сделай рефакторинг функции, через определение вспомогательных приватных функций.
// Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

// Сначала сделай запуск функции и посмотри на результат её работы.
// Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.

private fun checks(size: Int, result: String) {
    if (size <= 0) throw IllegalArgumentException("$result должно быть положительным и больше нуля")
}

private fun printBorder(width: Int, corner: Char, middle: Char) {
    val line = StringBuilder()               // Используем StringBuilder для более эффективной конкатенации строк
    line.append(corner)                      // Начинаем с угла
    for (i in 1 until width - 1) {
        line.append(middle)                  // Добавляем среднюю часть
    }
    line.append(corner)                      // Завершаем углом
    println(line)                            // Печатаем строку
}

private fun printMiddleLine(width: Int) {
    val middleLine = StringBuilder()          // Используем StringBuilder
    middleLine.append("|")                    // Начинаем с боковой границы
    for (j in 1 until width - 1) {
        middleLine.append(" ")                // Добавляем пробелы между боковыми границами
    }
    middleLine.append("|")                    // Завершаем боковой границей
    println(middleLine)                       // Печатаем строку
}

fun drawRectangle(width: Int, height: Int) {
    checks(width, "width")               // Проверка ширины
    checks(height, "height")             // Проверка высоты

    // Рисуем верхнюю границу
    printBorder(width, '+', '-')

    // Рисуем боковые границы
    for (i in 1 until height - 1) {
        printMiddleLine(width)
    }

    // Рисуем нижнюю границу
    printBorder(width, '+', '-')
}


// Сделай рефакторинг функции, которую разбирали на уроке и устрани баг,
// из-за которого таблица разъезжается при разных размерностях аргументов


private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun createRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size  // Диапазон от 0 до положительного значения
    } else {
        0 downTo size  // Диапазон от 0 до отрицательного значения
    }
}

// Форматирование и печать строки с числами (оси или элементы карты)
private fun printFormattedLine(values: IntProgression, formatterSize: Int) {
    for (i in values) {
        print("%${formatterSize}s".format(i))
    }
    println()
}

// Форматирование и печать одного значения на карте
private fun getMapSymbol(i: Int, j: Int): String {
    val m = i * j
    return when {
        m % 2 == 0 -> if (m % 3 == 0) "." else "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}

// Печать одной строки карты
private fun printMapRow(i: Int, xRange: IntProgression, formatterSize: Int) {
    print("%${formatterSize}s".format(i))  // Печать заголовка для Y
    for (j in xRange) {
        val result = getMapSymbol(i, j)
        print("%${formatterSize}s".format(result))
    }
    println()
}

// Основная функция для печати карты
fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")

    val formatterSize = " $xSize".length

    val xRange = createRange(xSize)  // Диапазон по оси X (положительные значения)
    val yRange = createRange(-ySize)  // Диапазон по оси Y (отрицательные значения)

    // Печать заголовков по оси X
    print(" ".repeat(formatterSize))
    printFormattedLine(xRange, formatterSize)

    // Печать строк карты
    for (i in yRange) {
        printMapRow(i, xRange, formatterSize)
    }
}

