package org.sergei.org.kotlincourse.lesson14

fun main(){

    // Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    // Определите среднее время выполнения теста.

    val tests = mapOf<String,Double>()
        println(tests.values.average())

    // Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
    // Выведите список всех тестовых методов.

    val tests2 = mapOf<String, String>()
    println(tests2.keys.toList())

    // В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val tests3 = mutableMapOf<String, Double>()
    tests3["test3_1"] = 0.15

    // Посчитайте количество успешных тестов в словаре с результатами.

    val test4 = mutableMapOf<String,Double>()
    val successfulTests = test4.count { it.value < 0.25 }

    // Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val test5 = mutableMapOf(
        "test1" to 0.2,
        "test2" to 0.5,
        "test3" to 0.1,
        "test4" to 0.3
    )
    test5.remove("test4")               // Удаление записи о баге с ключом "test4"

    println(test5)

    // Для словаря с результатами тестирования веб-страниц
    // (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.

    val testWeb = mapOf<String, Int>()
    for (entry in testWeb.entries) {
        println("${entry.key} =  ${entry.value}")
    }

    // Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val test7 = mapOf<String, Double>()
    println(test7.filter { it.value > 0.35 })

    // В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
    // Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.


}