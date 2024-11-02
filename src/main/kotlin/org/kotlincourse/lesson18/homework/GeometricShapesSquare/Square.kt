package org.sergei.org.kotlincourse.lesson18.homework.GeometricShapesSquare

class Square(private val side: Double) : Shape() {
    override val name = "Квадрат"

    override fun area(): Double {
        return side * side
    }
}