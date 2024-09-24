package org.sergei.org.kotlincourse.lesson3


val name: String = "Alise"

var age: Int = 30

const val UserInfo = 3.14
val lazyValue: String by lazy {
    "Hello world"}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field = 100
    }

val chassis: String = "12345abc"

val colour: String = "Blue"

var distance: Double = 0.0

lateinit var  owner: String

const val Wheels: Int = 4

val reports: String by lazy {
    ""
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }

