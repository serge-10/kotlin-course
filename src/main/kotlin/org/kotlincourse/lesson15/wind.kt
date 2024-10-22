package org.sergei.org.kotlincourse.lesson15

class wind(val speed: Double) {
    fun convertSpeed(): Double{
        return speed * 1000 / 3600
    }
}