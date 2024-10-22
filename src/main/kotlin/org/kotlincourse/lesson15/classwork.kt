package org.sergei.org.kotlincourse.lesson15

import org.sergei.org.kotlincourse.lesson3.speed

fun main() {
    val person = Person("John", 30)
    person.sayHello()

    var lamp1 = Lamp(isOn = true)
    lamp1.switch()

//    var wind = wind(speed: 10)
//    println(wind.convertSpeed())

    var car1 = Car(Car.brandList[2], "m5")
    car1.sayMyName()

}
