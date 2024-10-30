package org.sergei.org.kotlincourse.lesson17.homework

open class GeometricFigure(
    val color: String,
    val borderThickness: Int
) {
    open fun area() {
        println("Область фигуры нарисованна")
    }

    open fun perimeter(){
        println("Периметр нужно расчитать")
    }
}

// Класс Многоугольник, наследующийся от Геометрической фигуры

open class Polygon(
    color: String,
    borderThickness: Int,
    val sides: List<Double>
) : GeometricFigure(color,borderThickness)

// Класс Круг, наследующийся от Геометрической фигуры

class Circle(
    color: String,
    borderThickness: Int,
    val radius: Double
) : GeometricFigure(color,borderThickness)

// Класс Треугольник, наследующийся от Многоугольника

class Triangle(
    color: String,
    borderThickness: Int,
    sides: List<Double>
): Polygon(color,borderThickness,sides)

// Класс Четырехугольник, наследующийся от Многоугольника

class Quadrilateral(
    color: String,
    borderThickness: Int,
    sides: List<Double>
) : Polygon(color,borderThickness,sides)