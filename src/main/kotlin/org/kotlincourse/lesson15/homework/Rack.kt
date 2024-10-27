package org.sergei.org.kotlincourse.lesson15.homework

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()  // Список полок на стеллаже

    // Метод для добавления новой полки на стеллаж
    fun addShelf(shelf: Shelf): Boolean {
        return shelves.size < maxShelves  && shelves.add(shelf)
    }

    // Метод для удаления полки по индексу
    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false  // Полка не существует
        }
    }

    // Метод для добавления предмета на самую свободную полку
    fun addItem(item: String): Boolean {
        return shelves.any { it.addItem(item)  }

    }

    // Метод для удаления предмета с любой полки
    fun removeItem(item: String): Boolean {
        return shelves.any { it.removeItem(item) }

    }

    // Метод для проверки наличия предмета на одной из полок
    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }  // Проверяем все полки
    }

    // Метод для получения списка полок (неизменяемый)
    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    // Метод для печати содержимого стеллажа
    fun printContents() {
        for ((index, shelf) in shelves.withIndex()) {
            println("Shelf $index:")
            println("  Capacity: ${shelf.capacity}, Remaining Capacity: ${shelf.remainingCapacity()}")
            println("  Items: ${shelf.getItems().joinToString(", ")}")
        }
    }

    // Метод для сложного удаления полки с перераспределением предметов
    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()  // Если индекс неверный

        val shelfToRemove = shelves[index]
        val itemsToRedistribute = shelfToRemove.getItems().sortedByDescending { it.length }  // Сортируем предметы по длине
        val failedItems = mutableListOf<String>()

        // Пытаемся распределить предметы по другим полкам
        for (item in itemsToRedistribute) {
            val added = shelves.filterIndexed { i, _ -> i != index }  // Полки без удаляемой
                .any { it.addItem(item) }  // Пытаемся добавить предмет на любую из других полок
            if (!added) {
                failedItems.add(item)  // Если не удалось добавить, сохраняем в список неудач
            }
        }

        shelves.removeAt(index)  // Удаляем полку
        return failedItems  // Возвращаем список предметов, которые не удалось распределить
    }
    fun advancedRemoveShelf21(index: Int): List<String> {
        val unallocatedItems = mutableListOf<String>()
        if (index >= shelves.size) return unallocatedItems
        val removedShelf = shelves.removeAt(index)
        for (item in removedShelf.getItems().sortedByDescending { it.length }) {
            if (addItem(item)) continue
            unallocatedItems.add(item)
        }
        return unallocatedItems
    }
    }

// Пример использования
fun main() {
    val rack = Rack(3)  // Стеллаж с 3 полками

    val shelf1 = Shelf(20)  // Полка с вместимостью 20 символов
    val shelf2 = Shelf(30)  // Полка с вместимостью 30 символов
    val shelf3 = Shelf(25)  // Полка с вместимостью 25 символов

    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addShelf(shelf3)

    rack.addItem("Book")  // Добавляем предметы на полки
    rack.addItem("Laptop")
    rack.addItem("Notebook")

    rack.printContents()  // Вывод содержимого стеллажа

    println("Удаление предмета 'Laptop': ${rack.removeItem("Laptop")}")
    rack.printContents()

    println("Удаление полки 1 с перераспределением предметов:")
    val failedItems = rack.advancedRemoveShelf(1)
    println("Не удалось распределить: ${failedItems.joinToString(", ")}")

    rack.printContents()
}
