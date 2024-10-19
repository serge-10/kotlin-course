package org.sergei.org.kotlincourse.lesson14

fun main(){

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }
// Цикл, который проходит по записям (key-value парам) карты (Map) через .entries.
// Получаем ключ и значение через entry.key и entry.value соответственно.

    for ((fruit, price) in fruitsPrices) { // деструкторизация
        println("Key: $fruit, Value: $price")
    }
// Цикл с деструктуризацией, где ключ (fruit) и значение (price) извлекаются напрямую. Упрощает доступ к парам карты.

    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
// Извлечение всех записей (key-value пары), ключей и значений из карты fruitsPrices.
// entries — набор пар ключ-значение, keys — набор всех ключей, values — набор всех значений.

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() }
// Метод getOrElse возвращает значение по ключу "pear", если его нет — выбрасывается исключение IllegalArgumentException.

    val priceOfApple = fruitsPrices.getValue("apple")
// Получение значения для ключа "apple". Если ключа нет, будет выброшено исключение NoSuchElementException.

    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)
// Метод getOrDefault возвращает значение по ключу "pear", если ключ не найден — вернется значение по умолчанию (0.0).

    val fruitsWithoutBanana = fruitsPrices - "banana"
// Создается новая карта, которая не содержит ключ "banana". Оператор минус (-) удаляет элемент из карты.

    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5)
// Создается новая карта, в которую добавляется пара ключ-значение "pineapple" -> 3.5. Оператор плюс (+) добавляет элемент.

    val mutableFruits = fruitsPrices.toMutableMap()
// Преобразование неизменяемой карты в изменяемую (mutable) для последующего изменения элементов.

    mutableFruits["kiwi"] = 2.75 // Добавление элемента
// Добавление нового элемента с ключом "kiwi" и значением 2.75 в изменяемую карту.

    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))
// Добавление нескольких новых элементов в изменяемую карту.

    mutableFruits.remove("apple") // Удаление элемента
// Удаление элемента с ключом "apple" из карты.

    mutableFruits.clear()
// Очистка карты, удаление всех элементов.

    val containsApple = fruitsPrices.containsKey("apple")
// Проверка, содержит ли карта ключ "apple". Возвращает true, если ключ есть, иначе false.

    val containsValue1_5 = fruitsPrices.containsValue(1.5)
// Проверка, содержит ли карта значение 1.5. Возвращает true, если значение есть, иначе false.

    val isEmpty = fruitsPrices.isEmpty()
// Проверка, пуста ли карта. Возвращает true, если карта не содержит элементов.

    val isNotEmpty = fruitsPrices.isNotEmpty()
// Проверка, содержит ли карта хотя бы один элемент. Возвращает true, если карта не пуста.

    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
// Проверка, удовлетворяют ли все элементы карты условию (все цены > 1.0). Возвращает true, если да.

    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }
// Проверка, есть ли хотя бы один элемент, который удовлетворяет условию (цена < 1.0). Возвращает true, если есть.

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
// Создание новой карты с элементами, где значение больше 1.0.

    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
// Создание новой карты, содержащей элементы, ключи которых начинаются с буквы "a".

    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
// Создание новой карты, содержащей элементы, у которых значение меньше 2.0.

    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
// Создание новой карты, исключающей элемент с ключом "apple".

    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }
// Подсчет количества элементов, где значение больше 1.5.

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
// Создание новой карты, в которой все значения увеличены на 10%.

    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
// Создание новой карты, где все ключи переведены в верхний регистр.

    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }
// Преобразование карты в список строк, где каждый элемент — это строка формата "fruit costs price".

    val toMap = mutableFruits.toMap()
// Преобразование изменяемой карты в неизменяемую.

    val toMutableMap = fruitsPrices.toMutableMap()
// Преобразование неизменяемой карты в изменяемую.





}