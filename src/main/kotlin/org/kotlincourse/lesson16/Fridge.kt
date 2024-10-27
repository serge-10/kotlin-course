package org.sergei.org.kotlincourse.lesson16

class Fridge(val capacity: Int) { // Класс Fridge описывает холодильник с максимальной вместимостью секций,
                                  // переданной через параметр capacity.

    private val sections = mutableListOf<Section>() // Приватный список секций (Section), который хранит все секции в холодильнике.
                                                    // Начально пуст.

    fun addSection(section: Section): Boolean {                   // Метод добавления секции в холодильник.
        return sections.size < capacity && sections.add(section) // Возвращает true, если секция добавлена, иначе false.
    }

    fun removeSectionsByType(type: String): Boolean {    // Метод удаления всех секций указанного типа.
        val removedSections = sections.removeIf { it.type == type } // Удаляем секции указанного типа.
        return removedSections            // Возвращаем true, если хотя бы одна секция была удалена, иначе false.
    }

    fun removeSectionWithRedistribution(section: Section): List<Item> { // Метод удаления указанной секции с возможностью перераспределить её предметы.
        return section.items.toList().also { sections.remove(section) } // Возвращает список удалённых предметов.
    }

    fun addItem(item: Item): Boolean { // Метод добавления предмета в подходящую секцию (по типу и при наличии свободного места).
        return sections.find { it.type == item.type && it.getFreeSpace() >= it.convertWeightToVolume(item) }
            ?.let { it.addItem(item) } ?: false // Возвращает true, если предмет успешно добавлен, иначе false.
    }

    fun findItemByNameAndType(name: String, type: String): Item? {  // Метод поиска предмета по имени и типу среди всех секций.
        return sections.find { it.type == type }?.findItemByName(name) // Возвращает найденный Item или null, если предмет не найден.
    }

    fun removeItem(item: Item): Boolean { // Метод удаления указанного предмета из его секции.
        return sections.find { it.type == item.type }?.remove(item) ?: false // Возвращает true, если предмет был удален, иначе false.
    }

    fun removeAllItemsByName(name: String): Int { // Метод удаления всех предметов с заданным именем из холодильника.
        var removedCount = 0               // Счетчик удаленных предметов.
        sections.forEach { section ->      // Проходим по всем секциям.
            removedCount += section.items.count { it.name == name } // Считаем количество предметов с заданным именем.
            section.items.removeIf { it.name == name } // Удаляем предметы с заданным именем из секции.
        }
        return removedCount // Возвращаем общее количество удаленных предметов.
    }

    fun viewFridge() { // Метод для отображения информации о всех секциях в холодильнике.
        println(sections.joinToString("\n\n") { it.formatData() }) // Выводит данные о каждой секции, используя её метод formatData() для форматирования.
    }
}
