package org.sergei.org.kotlincourse.lesson17.homework

// Абстрактный класс Materials
abstract class Materials {

    protected val materials = mutableListOf<String>()

    abstract fun addMaterial(material: String)

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

// Первый подкласс — добавляет строку на дно контейнера
class BottomInsertionContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}

// Второй подкласс — добавляет список строк поочерёдно с существующими
class AlternatingInsertionContainer : Materials() {
    fun addMaterials(materialsList: List<String>) {
        materialsList.forEachIndexed { index, material ->
            val insertIndex = index * 2
            if (insertIndex <= materials.size) {
                materials.add(insertIndex, material)
            } else {
                materials.add(material) // Добавляем в конец, если индекс превышает размер списка
            }
        }
    }

    override fun addMaterial(material: String) {
        // Метод оставлен пустым, поскольку в этом подклассе используются списки
    }
}




// Третий подкласс — добавляет элементы в алфавитном порядке
class AlphabeticalInsertionContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }
}

// Четвёртый подкласс — добавляет ключи в начало, а значения в конец
class DictionaryInsertionContainer : Materials() {
    fun addMaterialsFromDictionary(dictionary: Map<String, String>) {
        for ((key, value) in dictionary) {
            materials.add(0, key)
            materials.add(value)
        }
    }

    override fun addMaterial(material: String) {
        // Метод оставлен пустым, так как используется словарь
    }
}


