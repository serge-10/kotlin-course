package org.sergei.org.kotlincourse.lesson30.homework

// Задание 1
// Создай Enum со статусами прохождения теста (pass, broken, failure).
// Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
// Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class PassingTest {
    PASS,
    BROKEN,
    FAILURE;
}

enum class TypeOfLivingSpace(val livingSpace: String) {
    APARTMENT("Квартира"),
    STUDIO("Студия"),
    TOWNHOUSE("Таунхаус"),
    PENTHOUSE("Пентхаус"),
    COTTAGE("Коттедж"),
    VILLA("Вилла"),
    MANSION("Особняк"),
    LOFT("Лофт"),
    FARMHOUSE("Фермерский дом");
}

enum class Planets(val distanceToSunAU: Double, val massRelativeToEarth: Double) {
    MERCURY(0.39, 0.055),  // Меркурий: расстояние до Солнца 0.39 а.е., масса 0.055 масс Земли
    VENUS(0.72, 0.815),    // Венера: расстояние до Солнца 0.72 а.е., масса 0.815 масс Земли
    EARTH(1.0, 1.0),       // Земля: расстояние до Солнца 1.0 а.е., масса 1.0 масс Земли
    MARS(1.52, 0.107),     // Марс: расстояние до Солнца 1.52 а.е., масса 0.107 масс Земли
    JUPITER(5.2, 317.8),   // Юпитер: расстояние до Солнца 5.2 а.е., масса 317.8 масс Земли
    SATURN(9.58, 95.16),   // Сатурн: расстояние до Солнца 9.58 а.е., масса 95.16 масс Земли
    URANUS(19.22, 14.54),  // Уран: расстояние до Солнца 19.22 а.е., масса 14.54 масс Земли
    NEPTUNE(30.05, 17.15); // Нептун: расстояние до Солнца 30.05 а.е., масса 17.15 масс Земли
}

// Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины названия enum.

fun printLivingSpacesByLength() {
    // Сортируем значения enum по длине человекопонятного названия
    val sortedSpaces = TypeOfLivingSpace.entries.sortedBy { it.livingSpace.length }
    // Печатаем каждое название
    sortedSpaces.forEach { println(it.livingSpace) }
}

// Задание 3
// Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и
// возвращает Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда.
// Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.

fun function(tests: () -> Unit): PassingTest {
    return try {
        tests()
        PassingTest.PASS
    } catch (e: AssertionError) {
        PassingTest.FAILURE
    } catch (e: Exception) {
        PassingTest.BROKEN
    }
}

// Задание 4
// Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.

fun function2(filter: (Planets) -> Boolean): Planets {
    return Planets.entries.firstOrNull(filter) ?: throw NoSuchElementException("Список пуст")
}



fun main() {
    println("Задача 2")
    printLivingSpacesByLength()
    println("Задача 3")
    val result1 = function {
        println("Running test 1")
        // Тест завершится успешно
    }
    println(result1) // PASS

    val result2 = function {
        println("Running test 2")
        assert(false) // Исключение AssertionError
    }
    println(result2) // FAILURE

    val result3 = function {
        println("Running test 3")
        throw IllegalStateException("Some error") // Другое исключение
    }
    println(result3) // BROKEN
    println("Задача 4")
    // Найти первую планету, которая ближе к Солнцу, чем Земля
    val result41 = function2 { it.distanceToSunAU < 1.0 }
    println(result41) // MERCURY

    // Найти первую планету, которая тяжелее Земли
    val result42 = function2 { it.massRelativeToEarth > 1.0 }
    println(result42) // JUPITER

    // Попытка найти планету, которая дальше Нептуна
    try {
        val result43 = function2 { it.distanceToSunAU > 30.0 }
        println(result43)
    } catch (e: NoSuchElementException) {
        println(e.message) // Список пуст
    }
}

