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
    val successfulTests = test4.count { it.value < 0.5 }

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

    val apiTestResults = mapOf<String, String>(
        "/login" to "200 OK",
        "/signup" to "201 Created",
        "/logout" to "404 Not Found"
    )

    val endpoint = "/profile"
    val status = apiTestResults.getOrDefault(endpoint, "Не был протестирован")

    println("Статус для $endpoint: $status")


    // Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
    // получите значение для "browserType". Ответ не может быть null.

    val config = mapOf(
        "browserType" to "Chrome",
        "baseUrl" to "https://example.com",
        "timeout" to "30"
    )

    val browserType = config.getValue("browserType")

    println("Тип браузера: $browserType")

    // Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

    val mapData = mapOf(
        "Smoke-тестирование" to "Pass",
        "Функциональное тестирование" to "Pass",
        "Автоматизированное тестирование" to "Pass"
    )

    val mapDatanew = mapData.toMutableMap()
    mapDatanew["Интеграционное тестирование"] = "Pass"

    // Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
    // получите настройки для конкретной модели или верните настройки по умолчанию.

    val deviceSettings = mapOf(
        "iPhone 12" to "High resolution, Dark mode",
        "Samsung Galaxy S21" to "Medium resolution, Light mode",
        "Google Pixel 5" to "Low resolution, Dark mode"
    )

    val deviceModel = "OnePlus 9"                                   // Модель устройства для поиска

    val deviceSettingsNew = deviceSettings.getOrElse(deviceModel) { // Получение настроек для устройства или возврат настроек по умолчанию
        "Вернуть настройки по умолчанию"
    }
        println("Настройки для $deviceModel: $deviceSettingsNew")

    // Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    val errorCodes = mapOf(
        100 to "Ошибка сети",
        300 to "Ошибка базы данных",
        500 to "Внутренняя ошибка сервера"
    )
    val errorCodeToCheck = 200           // Код  для проверки

    val containsErrorCode = errorCodes.any { it.key == errorCodeToCheck }   // Проверка, есть ли в словаре указанный код ошибки

    if (containsErrorCode) {
        println("Словарь содержит код ошибки $errorCodeToCheck")
    } else {
        println("Словарь не содержит код ошибки $errorCodeToCheck")
    }


    // Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    // а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.

    val testResults = mapOf(
        "Test1_V1" to "Passed",
        "Test2_V1" to "Failed",
        "Test3_V2" to "Skipped",
        "Test4_V1" to "Passed",
        "Test5_V2" to "Failed"
    )
    val versionToFilter = "V1"          // Определенная версия тестов для фильтрации

    val filteredResults = testResults.filter {(key) -> key.endsWith(versionToFilter)}  // Фильтрация словаря по версии

    println("Отфильтрованные результаты тестов для версии $versionToFilter: $filteredResults")


    // У вас есть словарь, где ключи — это названия функциональных модулей приложения,
    // а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val testingResults = mapOf(
        "Модуль A" to "Passed",
        "Модуль B" to "Failed",
        "Модуль C" to "Passed",
        "Модуль D" to "Skipped"
    )
    val hasFailedModules = testingResults.any { it.value == "Failed" }    // Проверка на наличие неудачных тестов

    // Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val testEnvironmentSettings = mutableMapOf(
        "OS" to "Windows",
        "Browser" to "Chrome",
        "Resolution" to "1920x1080"
    )

    val additionalSettings = mapOf(
        "Database" to "MySQL",
        "Memory" to "8GB",
        "Timeout" to "30s"
    )

    testEnvironmentSettings.putAll(additionalSettings)     // Добавление настроек из другого словаря

    println("Обновленные настройки тестовой среды: $testEnvironmentSettings")

    // Объедините два неизменяемых словаря с данными о багах.

    val bugsList1 = mapOf(
        101 to "Ошибка в модуле A",
        102 to "Ошибка в модуле B"
    )
    val bugsList2 = mapOf(
        103 to "Ошибка в модуле C",
        102 to "Ошибка в модуле B (обновленная)" // Обновление существующего бага
    )
    val bugListSum = bugsList1 + bugsList2
    println(bugListSum)

    // Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val lastRunResults = mutableMapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped"
    )

    lastRunResults.clear()
    println(lastRunResults)

    // Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val testResults1 = mapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped",
        "Test4" to "Passed",
        "Test5" to "Skipped"
    )
    val filteredResults1 = testResults.filter { it.value != "Skipped" }
    println(filteredResults1)

    // Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val testConfigurations = mutableMapOf(
        "Browser" to "Chrome",
        "OS" to "Windows",
        "Database" to "MySQL",
        "OldConfig1" to "Deprecated",
        "OldConfig2" to "Obsolete"
    )
    val obsoleteConfigurations = listOf("OldConfig1", "OldConfig2")    // Устаревшие конфигурации, которые нужно удалить

    for (config in obsoleteConfigurations) {       // Удаление устаревших конфигураций
        testConfigurations.remove(config)
    }

    println(testConfigurations)

    // Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
    // (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

    val testResults2 = mapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped",
        "Test4" to "Passed"
    )
    val report = testResults2.map { (testId, result) -> "$testId: $result" }   // Преобразование словаря в список строк


    println("Отчет о тестировании:")
    report.forEach { println(it) }

    // Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    val archivedResults2: Map<String, String> = testResults2.toMap()   // Преобразование в неизменяемый словарь

    println("Архивированные результаты тестирования: $archivedResults2")

    // Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
    // заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод,
    // например getNameById(id: String))

    val testExecutionTimes = mapOf(
        "1" to 120,
        "2" to 150,
        "3" to 90
    )
    val transformedResults = testExecutionTimes.map { (id, time) ->    // Преобразование словаря, заменяя ID тестов на их названия
        getNameById(id) to time }.toMap()                             // Преобразуем обратно в словарь


    println("Результаты выполнения тестов:")                          // Вывод преобразованного словаря
    for ((testName, time) in transformedResults) {
        println("$testName: $time секунд")
    }

    // Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
    // чтобы учесть новые условия тестирования.

    val performanceRatings = mutableMapOf(
        "Version 1.0" to 80.0,
        "Version 1.1" to 85.0,
        "Version 1.2" to 90.0,
        "Version 2.0" to 75.0
    )

    val updatedRatings = performanceRatings.mapValues { (key, value) -> value * 1.1 }  // Увеличение каждой оценки на 10%

    println("Обновленные оценки производительности:")    // Вывод обновленных оценок
    for ((version, rating) in updatedRatings) {
        println("$version: ${"%.2f".format(rating)}")
    }

    // Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val compilationErrors = mutableMapOf<String, String>()

    if (compilationErrors.isEmpty()) {
        println("Словарь с ошибками компиляции тестов пуст.")
    } else {
        println("Словарь с ошибками компиляции тестов содержит данные.")
    }

    // Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTestingResults = mutableMapOf<String, Int>(
        "Test1" to 1000,
        "Test2" to 1500,
        "Test3" to 2000
    )

    if (loadTestingResults.isNotEmpty()) {
        println("Словарь с результатами нагрузочного тестирования содержит данные.")
    } else {
        println("Словарь с результатами нагрузочного тестирования пуст.")
    }

    // Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    val testResults3 = mapOf(
        "Test1" to "Passed",
        "Test2" to "Passed",
        "Test3" to "Failed",
        "Test4" to "Passed"
    )

    val allPassed = testResults3.all { it.value == "Passed" }

    if (allPassed) {
        println("Все автоматизированные тесты прошли успешно.")
    } else {
        println("Некоторые автоматизированные тесты не прошли.")
    }

    // Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    val testResults4 = mapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Passed",
        "Test4" to "Error"
    )
    // Проверка, содержит ли словарь хотя бы один тест с ошибкой
    val hasErrors = testResults4.any { it.value == "Failed" || it.value == "Error" }

    if (hasErrors) {
        println("Словарь с результатами тестирования содержит хотя бы один тест с ошибкой.")
    } else {
        println("Все тесты прошли успешно.")
    }

    // Отфильтруйте словарь с результатами тестирования сервисов,
    // оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.

    val testResults5 = mapOf(
        "Test1 optional" to "Passed",
        "Test2 optional" to "Failed",
        "Test3" to "Failed",
        "Test4 optional" to "Passed",
        "Test5 optional" to "Error"
    )
    // Фильтрация словаря
    val filteredResults5 = testResults.filter {
        it.value != "Passed" && it.key.contains("optional")
    }
    // Вывод отфильтрованного словаря
    println("Отфильтрованные результаты тестирования:")
    for ((test, result) in filteredResults) {
        println("$test: $result")
    }
}

fun getNameById(id: String): String {
    return when (id) {
        "1" -> "Тест 1"
        "2" -> "Тест 2"
        "3" -> "Тест 3"
        else -> "Неизвестный тест"
    }
}
