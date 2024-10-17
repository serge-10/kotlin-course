package org.sergei.org.kotlincourse.lesson13

fun main() {

    // Проверить, что размер коллекции больше 5 элементов.

    val numbers1 = listOf(1, 2, 3, 4, 5, 6)
    println(numbers1.size > 5)


    // Проверить, что коллекция пустая

    val numbers2 = listOf<Int>()             // Пустой список
    println(numbers2.isEmpty())


    // Проверить, что коллекция не пустая

    val numbers3 = listOf(1, 2, 3, 4)
    println(numbers3.isNotEmpty())

    // Взять элемент по индексу или создать значение если индекса не существует

    val numbers4 = listOf(1, 2, 3, 4)
    println(numbers4.getOrElse(5) { 10 })

    // Собрать коллекцию в строку

    val numbers5 = listOf(4, 5, 6, 7, 8, 9)
    println(numbers5.joinToString(separator = ", ")) // Собираем элементы в строку, разделяя их запятыми

    // Посчитать сумму всех значений

    val numbers6 = listOf(1, 5, 6, 8, 9)
    println(numbers6.sum())

    // Посчитать среднее

    val numbers7 = listOf(4, 5, 8, 9, 7, 5)
    println(numbers7.average())

    // Взять максимальное число

    val numbers8 = listOf(2, 6, 7, 45, 57, 43)
    println(numbers8.maxOrNull())

    // Взять минимальное число

    val number9 = listOf(2, 6, 7, 45, 57, 43)
    println(number9.minOrNull())

    // Взять первое число или null

    val number10 = listOf(1, 5, 7, 8, 6)
    println(number10.firstOrNull())

    // Проверить что коллекция содержит элемент

    val number11 = listOf(1, 5, 7, 5)
    println(number11.contains(4))

    // Отфильтровать коллекцию по диапазону 18-30

    val numbers12 = listOf(4, 5, 8, 6, 7)
    println(numbers12.filter { it in 18..30 })

    // Выбрать числа, которые не делятся на 2 и 3 одновременно

    val numbers13 = listOf(45, 58, 87, 58)
    println(numbers13.filter { it % 2 == 0 && it % 3 == 0 })

    // Очистить текстовую коллекцию от null элементов

    val numbers14 = listOf("f", "f", "d", "s", null, null)
    val nonNullNumbers = numbers14.filterNotNull()    // Убираем null значения
    println(nonNullNumbers)                           // Выведет: [f, f, d, s]

    // Преобразовать текстовую коллекцию в коллекцию длин слов

    val numbers15 = listOf("Привет", "Котлин", "МИР", "Тест")
    println(numbers15.map { it.length })

    // Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова

    val numbers16 = listOf("Привет", "Котлин", "МИР", "Тест")
    println(numbers16.associate { it to it.reversed() })

    // Отсортировать список в алфавитном порядке

    val number17 = listOf("Привет", "Котлин", "МИР", "Тест")
    println(number17.sorted())

    // Отсортировать список по убыванию

    val numbers18 = listOf(8, 7, 9, 5, 2, 1, 3)
    println(numbers18.sortedDescending())

    // Распечатать квадраты элементов списка

    val number19 = listOf(8, 7, 9, 5, 2, 1, 3)
    println(number19.forEach { it * it })

    // Группировать список по первой букве слов

    val number20 = listOf("Привет", "Котлин", "МИР", "Тест")
    println(number20.groupBy { it.firstOrNull() })

    //Очистить список от дублей
    val numbers21 = listOf(1, 1, 5, 4, 5, 7, 8, 3, 8)
    println(numbers21.distinct())

    // Взять первые 3 элемента списка

    val numbers22 = listOf(1, 1, 5, 4, 5, 7, 8, 3, 8)
    println(numbers22.take(3))

    // Взять последние 3 элемента списка

    val numbers23 = listOf(1, 1, 5, 4, 5, 7, 8, 3, 8)
    println(numbers23.takeLast(3))


    // Задание 3: Анализ Учебных Оценок
    // Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    // Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    val topThreeGrades = grades.filter { it >= 60 }.sorted().take(3)

    println(topThreeGrades)               // Выведет: [67, 74, 85]

    // Задание 4: Создание каталога по первой букве.
    //Начальные значения: val list = listOf(
    //"Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
    // "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник",
    // "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло",
    // "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед",
    // "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
    // "посуда", "Настольная лампа", "торшер", "Этажерка")

    // Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.

    val list = listOf("Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
         "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник",
         "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло",
         "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед",
         "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
         "посуда", "Настольная лампа", "торшер", "Этажерка")

    val listGroup = list.map { it.lowercase() }.groupBy { it.first() }
            println(listGroup)

    // Задание 5: Подсчёт средней длины слов в списке.

    // Начальные значения из задачи 3.

    // Цель: Перевести все слова в количество букв, подсчитать среднее значение.

    // Вывести форматированный текст с двумя знаками после запятой.

    // Переводим слова в их длины (количество букв)
    val wordLengths = list.map { it.length }

    // Вычисляем среднее значение длины слов
    val averageLength = wordLengths.average()

    // Выводим результат с форматированием до двух знаков после запятой
    println("Средняя длина слов: %.2f".format(averageLength))

    // Задание 6: Категоризация чисел.

    // Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    // Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    println(numbers.distinct().sorted().groupBy { if (it % 2 == 0) "четные" else "нечетные" })


    // Задание 7: Поиск первого подходящего элемента

    // Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
    // Цель: Найти первый возраст в списке, который соответствует условию (больше 18),
    // преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".

    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    val result = ages.firstOrNull { it != null && it > 18 }   // Находим первый возраст, который больше 18 и преобразуем его в строку
        ?.let { it.toString() } ?: "Подходящий возраст не найден"

    println(result)


}


    // Задание 2: Характеристика числовой коллекции

    // Написать метод, который принимает коллекцию чисел и возвращает строку
    // с текущим состоянием коллекции используя конструкцию when

    // Если коллекция пустая - “Пусто”

fun describeNumberCollection(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"                      // Если коллекция пустая
        numbers.size < 5 -> "Короткая"                    // Если количество элементов меньше пяти
        numbers.firstOrNull() == 0 -> "Стартовая"         // Если коллекция начинается с 0
        numbers.sum() > 10000 -> "Массивная"              // Если сумма всех чисел больше 10000
        numbers.average() == 10.0 -> "Сбалансированная"   // Если среднее значение равно 10
        numbers.joinToString("").length == 20 -> "Клейкая" // Если длина строки из элементов равна 20
        numbers.maxOrNull() ?: 0 < -10 -> "Отрицательная" // Если максимальное число меньше -10
        numbers.minOrNull() ?: 0 > 1000 -> "Положительная" // Если минимальное число больше 1000
        3 in numbers && 14 in numbers -> "Пи***тая"        // Если содержит одновременно числа 3 и 14
        else -> "Уникальная"                               // Иначе
    }
}