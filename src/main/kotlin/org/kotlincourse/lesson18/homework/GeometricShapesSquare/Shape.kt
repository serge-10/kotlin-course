package org.sergei.org.kotlincourse.lesson18.homework.GeometricShapesSquare

abstract class Shape {
    abstract val name: String

    open fun area(): Double {
        return 0.0
    }
}