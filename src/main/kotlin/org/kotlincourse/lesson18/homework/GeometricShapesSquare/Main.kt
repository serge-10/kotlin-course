package org.sergei.org.kotlincourse.lesson18.homework.GeometricShapesSquare

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )

    // Вывод площади для каждой фигуры с названием
    shapes.forEach { shape ->
        println("Площадь фигуры (${shape.name}): ${shape.area()}")
    }
}