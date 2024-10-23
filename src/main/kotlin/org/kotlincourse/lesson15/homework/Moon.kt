package org.sergei.org.kotlincourse.lesson15.homework

object Moon {

    var isVisible: Boolean = false
    var phase: String = "Новая луна"

    // Метод для вывода текущей фазы Луны

    fun showPhase(){
        println("Current phase: $phase")
    }


}