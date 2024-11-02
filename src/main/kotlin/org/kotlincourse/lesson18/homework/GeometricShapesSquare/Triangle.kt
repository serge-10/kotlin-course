package org.sergei.org.kotlincourse.lesson18.homework.GeometricShapesSquare

class Triangle(private val sideA: Double,
               private val sideB: Double,
               private val angleInDegrees: Double) : Shape() {
    override val name = "Треугольник"

    override fun area(): Double {
        val angleInRadians = angleInDegrees * (3.14 / 180) // Перевод угла в радианы
        return 0.5 * sideA * sideB * kotlin.math.sin(angleInRadians) // Используем метод sin из kotlin.math
    }
}