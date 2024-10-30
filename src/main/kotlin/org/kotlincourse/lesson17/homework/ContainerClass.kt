package org.sergei.org.kotlincourse.lesson17.homework

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

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

// Класс ExtractFirst - извлекает первый элемент
class ExtractFirst : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 1 until extracted.size) {
            addMaterial(extracted[i])
        }
        return extracted[0]
    }
}

// Класс ExtractLast - извлекает последний элемент
class ExtractLast : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 0 until extracted.size - 1) {
            addMaterial(extracted[i])
        }
        return extracted.last()
    }
}

// Класс ExtractMiddle - извлекает средний элемент
class ExtractMiddle : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        val middleIndex = extracted.size / 2
        for (i in extracted.indices) {
            if (i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}