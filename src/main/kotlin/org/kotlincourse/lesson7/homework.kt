package org.sergei.org.kotlincourse.lesson7

import org.sergei.org.kotlincourse.lesson3.count

//Задания для Цикла for

//Прямой Диапазон:

//Напишите цикл for, который выводит числа от 1 до 5.

fun main(){
//    for (i in 1..5){
//        println(i)
//    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.

//    for (i in 1..10) {
//        if(i % 2 == 0) {
//            println(i)
//        }
//
//    }

    //Обратный Диапазон:

    //Создайте цикл for, который выводит числа от 5 до 1.

//    for (i in 5 downTo 1){
//        println(i)
//    }
    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
//    for (i in 10 downTo 1){
//        println(i - 2)
//    }



    //С Шагом (step):

    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
//    for (i in 1..9 step 2){
//        println(i)
//    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
//    for (i in 1..20 step 3){
//        println(i)
//    }

    //Использование До (until):

    //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
//    for (i in 1 until 9){
//        println(i)
//    }

    //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
//    for (i in 3 until 15){
//        println(i)
//    }

    //Задания для Цикла while

    //Создайте цикл while, который выводит квадраты чисел от 1 до 5

//    var qvadrat = 1
//    while (qvadrat ++ <= 5){
//        println(qvadrat * qvadrat) //создаём квадрат числа
//    }

    //Напишите цикл while, который уменьшает число от 10 до 5.
    // После этого вывести результат в консоль

//    var number = 10
//    while (number-- >= 5) {
//        println(number) // Выводим текущее значение числа
//    }

    //Цикл do...while:

    //Используйте цикл do...while, чтобы вывести числа от 5 до 1

//        var number = 5
//        do {
//            println(number)     // Выводим текущее значение переменной number
//            number--            // Уменьшаем значение на 1
//        } while (number >= 1)   // Условие для продолжения цикла

    //Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

//        var number = 5
//        do {
//            println(number) // Выводим текущее значение переменной number
//            number ++ // Увеличеваем значение на 1
//        } while (number <= 10)  // Условие для продолжения цикла

    //Задания для Прерывания и Пропуска Итерации

        //Использование break:

        //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

//        for (i in 1..10){
//                if (i == 6){           // Если переменная равна 6 то мы останавливаем цикл
//                    break
//                }
//            println(i)
//        }

        //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
//        var countr = 1
//        while (countr > 0){
//            if (countr == 10){           // Если переменная равна 10 то цикл прекоащает работу
//                break
//            }
//        println(countr)
//            countr++
//        }

    //Использование continue:

    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

//        for (i in 1..10){
//            if(i % 2 == 0){          // если в переменой встречается числа кратные 2 то мы их пропускаем
//                continue
//            }
//        println(i)
//        }

    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
//    var countr = 1
//    while (countr <= 10) {               // Условие для цикла: от 1 до 10
//        if (countr % 3 == 0) {
//            countr++                      // Пропускаем числа, кратные 3
//            continue                      // Переходим к следующей итерации цикла
//        }
//        println(countr)                   // Выводим текущее значение
//        countr++                          // Увеличиваем значение
//    }

    //Задача на вложенный цикл

    //Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
// В консоль вывести результат умножения переменных цикла.
// Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
// После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.

    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")                    // Вывод результата умножения и пробел
        }
        println()                                  // Переход на новую строку после завершения внутреннего цикла
    }
}