package org.sergei.org.kotlincourse.lesson15.homework

class Party(val location: String,
            val attendees: Int
) {

    // Метод для вывода информации о вечеринке

    fun details() {
        println("Location: $location")
        println("Number of attendees: $attendees")
    }
}