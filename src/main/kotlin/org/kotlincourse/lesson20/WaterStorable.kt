package org.sergei.org.kotlincourse.lesson20

interface WaterStorable {
    val volume: Double
    fun fill(amont: Double)
    fun take(amont: Double)
}