package org.sergei.org.kotlincourse.lesson22.classwork.Homework

import kotlin.math.abs

fun Number.within(other: Number, deviation: Number ): Boolean {
    return (abs(this.toDouble() - other.toDouble())) <= deviation.toDouble()
}
