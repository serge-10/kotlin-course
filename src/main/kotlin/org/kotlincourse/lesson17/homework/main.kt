package org.sergei.org.kotlincourse.lesson17.homework

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    // Тест первого подкласса
    val bottomContainer = BottomInsertionContainer()
    bottomContainer.addMaterial("bottom")
    bottomContainer.printContainer()

    // Тест второго подкласса
    val alternatingContainer = AlternatingInsertionContainer()
    alternatingContainer.addMaterials(ordinalNumbers.take(5))
    alternatingContainer.printContainer()

    // Тест третьего подкласса
    val alphabeticalContainer = AlphabeticalInsertionContainer()
    ordinalNumbers.take(5).forEach { alphabeticalContainer.addMaterial(it) }
    alphabeticalContainer.printContainer()

    // Тест четвертого подкласса
    val dictionaryContainer = DictionaryInsertionContainer()
    val testDictionary = mapOf("key1" to "value1", "key2" to "value2")
    dictionaryContainer.addMaterialsFromDictionary(testDictionary)
    dictionaryContainer.printContainer()
}
