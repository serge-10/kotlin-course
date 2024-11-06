package org.sergei.org.kotlincourse.lesson18.homework.Printer

//Принтер
//Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами
// на белом фоне (хорошо работает на тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами
// на цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона
// и проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте.
//Подумать, как бы вынести в protected метод базового класса общую для обоих классов логику
// и избавиться от дублирования кода.

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val longText = "The quick brown fox jumps over the lazy dog and runs away into the sunset with a joyful bark."

    println("Лазерный принтер:")
    laserPrinter.printText(longText)

    println("\nСтруйный принтер:")
    inkjetPrinter.printText(longText)
}