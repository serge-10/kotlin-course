package org.sergei.org.kotlincourse.lesson15.homework

class Emotion(val type: String, val intensity: Int) {

    // Метод который выводит описание эмоции в зависимости от её типа и интенсивности.

    fun express(){
        println("Тип $type")
        println("Интенсивность $intensity")
    }
}