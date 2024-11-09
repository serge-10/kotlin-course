package org.sergei.org.kotlincourse.lesson20.Homework

abstract class PoweredDevice : Powerable {
    var isPoweredOn = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("Устройство включено")
        } else {
            println("Устройство уже включено")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("Устройство выключено")
        } else {
            println("Устройство уже выключено")
        }
    }
}
