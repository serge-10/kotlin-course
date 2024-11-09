package org.sergei.org.kotlincourse.lesson20.Homework

import java.io.InputStream

class FridgeDevice : TemperatureControlledOpeningDevice(), LightEmitting, Cleanable, SoundEmitting {
    override val maxTemperature: Int = 8

    override fun emitLight() {
        println("Свет в холодильнике включен")
    }

    override fun completeLiteEmission() {
        println("Свет в холодильнике выключен")
    }

    override fun clean() {
        println("Холодильник очищен")
    }

    override fun setVolume(volume: Int) {
        println("Установлена громкость звука в холодильнике: $volume")
    }

    override fun mute() {
        println("Звук в холодильнике выключен")
    }

    override fun playSound(stream: InputStream) {
        println("Проигрывание звука в холодильнике")
    }
}
