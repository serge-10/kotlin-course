package org.sergei.org.kotlincourse.lesson18.homework.GeometricShapesSquare

class Circle(private val radius: Double) : Shape() {
    override val name = "Круг"

    override fun area(): Double {
        return 3.14 * radius * radius
    }
}