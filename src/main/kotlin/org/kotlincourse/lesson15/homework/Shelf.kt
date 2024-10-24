package org.sergei.org.kotlincourse.lesson15.homework

class Shelf(internal val capacity: Int) {
    private val items = mutableListOf<String>()  // Список для хранения предметов

    // Метод для добавления предмета на полку
    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)             // Добавляем предмет на полку
            true                        // Место есть, возвращаем true
        } else {
            false                       // Места нет, возвращаем false
        }
    }

    // Метод для удаления предмета с полки
    fun removeItem(item: String): Boolean {
        return if (items.remove(item)) {
            true                     // Предмет найден и удален, возвращаем true
        } else {
            false                    // Предмет не найден, возвращаем false
        }
    }

    // Метод для проверки, вместится ли предмет на полку
    fun canAccommodate(item: String): Boolean {
        val currentLoad = items.sumOf { it.length }      // Текущая сумма длины названий предметов
        return currentLoad + item.length <= capacity     // Проверяем, хватит ли места
    }

    // Метод для проверки наличия предмета на полке
    fun containsItem(item: String): Boolean {
        return items.contains(item)                      // Проверяем, есть ли предмет на полке
    }

    // Метод для получения списка предметов на полке (неизменяемый)
    fun getItems(): List<String> {
        return items.toList()                           // Возвращаем неизменяемый список предметов
    }

    // Возвращает оставшуюся вместимость
    fun remainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}