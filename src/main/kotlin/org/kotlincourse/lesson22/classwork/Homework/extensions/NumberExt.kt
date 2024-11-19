package org.sergei.org.kotlincourse.lesson22.classwork.Homework.extensions


//Проверка допустимого отклонения числа
import kotlin.math.abs

fun Number.within(other: Number, deviation: Number): Boolean {

    val difference = abs(this.toDouble() - other.toDouble())  // Преобразуем текущий объект и число для сравнения в
                                                                 // Double и вычисляем разницу

    return difference <= deviation.toDouble()                    // Проверяем, не превышает ли разница допустимое отклонение
}


