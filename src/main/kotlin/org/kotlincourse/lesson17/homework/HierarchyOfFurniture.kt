package org.sergei.org.kotlincourse.lesson17.homework

// Базовый класс Мебель
open class Furniture(
    val material: String,
    val color: String,
    val weight: Double
) {
    open fun assemble() {
        println("Мебель собрана.")
    }

    open fun disassemble() {
        println("Мебель разобрана.")
    }
}

// Класс Стул, наследующийся от Мебели
open class Chair(
    material: String,
    color: String,
    weight: Double,
    val isFoldable: Boolean // Возможность складываться
) : Furniture(material, color, weight) {

    fun sit() {
        println("Вы сидите на стуле.")
    }
}

// Класс Стол, наследующийся от Мебели
open class Table(
    material: String,
    color: String,
    weight: Double,
    val shape: String
) : Furniture(material, color, weight) {

    fun placeItems() {
        println("Предметы размещены на столе.")
    }
}

// Класс Кровать, наследующийся от Мебели
open class Bed(
    material: String,
    color: String,
    weight: Double,
    val size: String
) : Furniture(material, color, weight) {

    fun lieDown() {
        println("Вы легли на кровать.")
    }
}

// Класс Офисный Стул, наследующийся от Стула
class OfficeChair(
    material: String,
    color: String,
    weight: Double,
    isFoldable: Boolean,
    val hasWheels: Boolean
) : Chair(material, color, weight, isFoldable) {

    fun adjustHeight() {
        println("Высота офисного стула отрегулирована.")
    }
}

// Класс Кухонный Стол, наследующийся от Стола
class KitchenTable(
    material: String,
    color: String,
    weight: Double,
    shape: String,
    val seatingCapacity: Int
) : Table(material, color, weight, shape) {

    fun clean() {
        println("Кухонный стол очищен.")
    }
}

// Класс Двуспальная Кровать, наследующийся от Кровати
class DoubleBed(
    material: String,
    color: String,
    weight: Double,
    size: String,
    val hasStorage: Boolean
) : Bed(material, color, weight, size) {

    fun openStorage() {
        if (hasStorage) {
            println("Место для хранения под кроватью открыто.")
        } else {
            println("Эта кровать не имеет места для хранения.")
        }
    }
}
