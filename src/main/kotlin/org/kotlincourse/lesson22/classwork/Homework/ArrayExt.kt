package org.sergei.org.kotlincourse.lesson22.classwork.Homework

// 1. Функция-расширение для массива чисел
fun Array<Int>.toMinMaxPair(): Pair<Int, Int> {
    val min = this.minOrNull() ?: 0
    val max = this.maxOrNull() ?: 0
    return Pair(min, max)
}
