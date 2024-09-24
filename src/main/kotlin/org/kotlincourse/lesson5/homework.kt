package org.sergei.org.kotlincourse.lesson5


// Простой уровень

// (12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true

// (14 - 4 <= 10) || (6 / 2 != 3)      true || false =  true

// (9 + 1 == 10) && (8 % 2 == 0)    true && true  = true

// (7 - 2 < 5) || (4 * 3 != 12)    false || false = false

//  (18 / 6 >= 3) && (5 + 5 == 10)  true &&  true = true

// (11 % 3 != 2) || (9 - 3 == 6)   false || true = true

// (5 * 2 < 11) && (14 / 2 == 7)  true && true = true

// (8 + 2 <= 10) || (7 % 2 != 1)  true || false = true

// (16 / 4 > 3) && (3 + 4 == 7)  true && true = true

// (10 % 2 == 0) || (5 - 3 != 1) true || true = true

// Сложный уровень

//((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1)  (true && false) || false = false

// ((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7)  (true || true ) && true = true

// ((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0) (true && true ) || false = true

// ((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8) (false && false) || true = true

// ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6) (true || false ) || false = true

// Продвинутый уровень

// (var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5))  true || (true && false) = true

// ((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5)  (false || true ) || true = true

// (var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1) true || true && false = true

// ((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5) (true || false) && true = true

// (var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1)) false && (true || false) = false

// задачи


/*fun calculateSoundIntensity(initialIntensity: Double, decayCoefficient: Double?): Double {
    // Используем оператор Элвиса (?:) для задания стандартного значения
    val effectiveDecayCoefficient = decayCoefficient ?: 0.5

    // Расчет предполагаемой интенсивности звука после затухания
    return initialIntensity * effectiveDecayCoefficient
}

fun main() {
    // Примеры вызова функции с различными значениями
    val initialIntensity = 100.0

    // Пример с заданным коэффициентом затухания
    val decayCoefficient1: Double? = 0.7
    println("Intensity with decay coefficient $decayCoefficient1: " +
            calculateSoundIntensity(initialIntensity, decayCoefficient1))

    // Пример с не заданным коэффициентом затухания (null)
    val decayCoefficient2: Double? = null
    println("Intensity with default decay coefficient: " +
            calculateSoundIntensity(initialIntensity, decayCoefficient2))
}


fun calculateTotalShippingCost(shippingCost: Double?): Double {
    // Используем оператор Элвиса (?:) для задания стандартной стоимости, если стоимость не указана (null)
    val cost = shippingCost ?: 50.0

    // Рассчитываем страховку как 0.5% от стоимости
    val insurance = cost * 0.005

    // Рассчитываем полную стоимость доставки
    return cost + insurance
}

fun main() {
    // Примеры вызова функции с различными значениями
    val customShippingCost: Double? = 200.0 // Пользовательская стоимость
    println("Total shipping cost with custom cost $customShippingCost: $" +
            calculateTotalShippingCost(customShippingCost))

    val defaultShippingCost: Double? = null // Не указана стоимость
    println("Total shipping cost with default cost: $" +
            calculateTotalShippingCost(defaultShippingCost))
}


fun checkPressure(pressure: Double?) {
    if (pressure == null) {
        println("Ошибка: Показания атмосферного давления отсутствуют.")
    } else {
        println("Показания атмосферного давления: $pressure hPa")
    }
}/*

// Функция для проверки показаний атмосферного давления
*/fun checkPressure(pressure: Double?) {
    if (pressure == null) {
        // Вывод сообщения об ошибке, если давление отсутствует
        println("Ошибка: Показания атмосферного давления отсутствуют.")
    } else {
        // Вывод показаний давления, если оно присутствует
        println("Показания атмосферного давления: $pressure hPa")
    }
}

fun main() {
    // Примеры вызова функции с различными значениями

    // Пример с указанным давлением
    val pressureMeasurement: Double? = 1013.25
    checkPressure(pressureMeasurement) // Ожидаемый вывод: Показания атмосферного давления: 1013.25 hPa

    // Пример с отсутствующим давлением (null)
    val missingPressure: Double? = null
    checkPressure(missingPressure) // Ожидаемый вывод: Ошибка: Показания атмосферного давления отсутствуют.
}*/
