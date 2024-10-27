package org.sergei.org.kotlincourse.lesson16


class Section(
    val type: String,         // Тип секции (например, "liquids", "fruit"), передается при создании объекта Section.
    val capacity: Int         // Максимальная вместимость секции, указывающая, сколько предметов она может вместить.
) {

    val items = mutableListOf<Item>() // Приватный список предметов типа Item, который хранит все добавленные предметы в секции.

    fun addItem(item: Item): Boolean { // Метод для добавления предмета в секцию.
        val itemVolume = convertWeightToVolume(item) // Рассчитываем объем добавляемого предмета.
        return getFreeSpace() >= itemVolume && items.add(item) // Возвращаем true, если предмет добавлен, иначе false.
    }

    fun findItemByName(name: String): Item? {            // Метод для поиска предмета по имени в секции.
        return items.find { it.name == name }            // Возвращает найденный Item или null, если предмет не найден.
    }

    fun remove(item: Item): Boolean {
        return items.remove(item)  // Метод для удаления конкретного предмета из секции.
        // Возвращает true, если предмет был удален, иначе false.
    }

    fun getFreeSpace(): Int {                           // Метод для определения свободного места в секции
        val usedSpace = items.sumOf { convertWeightToVolume(it) }      // Суммируем объемы всех предметов в секции.
        return capacity - usedSpace                                     // Возвращаем доступное место.
    }

    fun formatData(): String { // Метод для форматированного представления информации о секции в виде строки.
        return """
type: $type                    // Тип секции.
   capacity: $capacity          // Общая вместимость секции.
   free: ${getFreeSpace()}      // Оставшееся свободное место в секции.
   items:                       // Список предметов в секции.
       ${items.joinToString("\n\t\t")} // Перечисляет предметы в секции с новой строки и отступом для каждого предмета.
       """.trimIndent() // Удаляет лишние отступы в начале строки для более читабельного вывода.
    }

    fun convertWeightToVolume(item: Item): Int { // Приватный метод для перевода веса предмета в объем.
        return (item.weight / conversionFactors.getValue(item.type)).toInt() // Делит вес на коэффициент конверсии из conversionFactors и возвращает целое число.
    }
}

