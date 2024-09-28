package org.sergei.org.kotlincourse.lesson8


//fun  main() {
//    val simpleString = "Это простая строка"
//
//    val firstName = "Иван"
//    val lastName = "Иванов"
//    val fullName = "$firstName $lastName"
//
//    val age = 30
//    val greeting = "Привет! Меня зовут $fullName, и мне $age лет."
//
//
//    val person = Person("Алексей", 25)
//    val introduction = "Меня зовут $person.name, и мне ${person.age} лет."
//
//    val details = "Здесь находятся ${getDetails()}"
//
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y равен ${x + y}"
//    println(resultString)
//
//
//}

//fun main({
//
//    val originalString = "Kotlin is fun" // Инициализация строки с текстом "Kotlin is fun"
//
//// Получаем подстроку, начиная с 7-го индекса (с 8-го символа, т.к. индексы начинаются с 0)
//val subString = originalString.substring(startIndex = 7) // результат: "is fun"
//
//// Получаем подстроку с 3-го по 6-й индексы (не включая 6-й индекс)
//val suString2 = originalString.substring(3, 6) // результат: "lin"
//
//// Замена всех вхождений символа 'n' на 'w'
//val replacedString = originalString.replace(oldValue = "n", newValue = "w") // результат: "Kotliw is fuw"
//
//// Разделение строки по указанным разделителям (здесь по слову "is")
//val words = originalString.split("is") // результат: ["Kotlin ", " fun"]
//
//// Получаем длину строки "Hello"
//val Length = "Hello".length // результат: 5
//
//// Преобразование строки в верхний регистр
//val upper = "hello".uppercase() // результат: "HELLO"
//
//// Преобразование строки в нижний регистр
//val Lower = "Hello".lowercase() // результат: "hello"
//
//// Удаление пробелов в начале и конце строки
//val trimmed: String = "   hello  ".trim() // результат: "hello"
//
//// Проверка, начинается ли строка с указанного префикса (здесь "Kot")
//val startsWith = "   hello  .".startsWith(prefix = "Kot") // результат: false
//
//// Проверка, заканчивается ли строка на указанный суффикс (здесь "ell")
//val ends = "Kotlin".endsWith(other = "ell") // результат: false
//
//// Проверка, содержит ли строка указанную подстроку (здесь "ell")
//val contains = "Hello".contains(other = "ell") // результат: true
//
//// Проверка, является ли строка `null` или пустой
//val e: String? = null
//val empty = e.isNullOrEmpty() // результат: true (так как e == null)
//
//// Проверка, состоит ли строка только из пробелов или пустая
//val blank = "   ".isNotBlank() // результат: false (так как строка содержит только пробелы)
//
//// Повторение строки "ab" три раза
//val repeat = "ab".repeat(n = 3) // результат: "ababab"
//
//// Получение символа строки по индексу (здесь 5-й индекс)
//val letter = originalString[5] // результат: 'i'
//
//// Поиск индекса первого вхождения символа 't' в строке "Kotlin"
//val indexOfChar = "Kotlin".indexOf(char = 't') // результат: 2
//
//// Поиск индекса первого вхождения слова "best" в строке
//val indexOfWord = "Kotlin is the best language".indexOf("best") // результат: 12
//
//// Переворачивание строки (реверс)
//val backReverse = "niltoK".reversed() // результат: "Kotlin"
//
//// Создание многострочной строки
//val multiLineString = """
//    Первая строка
//    Вторая строка
//    Третья строка
//""".trimIndent() // результат: многострочная строка без лишних отступов
//
//val string = "sweet suummer child" // Инициализация новой строки
//
//// Получение подстроки с 6-го индекса
//val subString = string.substring(startIndex = 6) // результат: "suummer child"
//
//// Получение подстроки с 6-го по 12-й индекс (не включая 12-й)
//val subString1 = string.substring(6, 12) // результат: "suumme"
//
//
//    val name = "Алексей"
//    val city = "Москва"
//    val age = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//   Имя: %s
//   Город: %s
//   Возраст: %d
//   Количество друзей: %,d
//   Рейтинг пользователя: %.1f
//   Баланс счета: $%,.2f
//""".trimIndent()
//
//    println(text.format(name, city, age, friendsCount, rating, balance))
//
//
//}

// Практика
//fun main(){
//    println(convert("Для завершения проекта важно"))
//}
//class  Person(val name: String, val age: Int)
//fun convert(string: String): String{
//    return  when {
//        string.startsWith("ошибка", true) -> string.replace("ошибка","небольшое недрозумение", true)
//        string.endsWith("важно", true) -> "$string ... но не критично."
//
//        else -> ""
//    }
//}

fun  main(){
//    var text1 = "Kotlin: The Fun Way to Learn Programming"
//    println(text1.substring(8,19))
//
    val text2 = "contact@example.com"
    val indexOfAt = text2.indexOf("@")
    println(text2.substring(8))
    println(text2.substring(indexOfAt + 1))
    val phone = "123-456-7890"
    val subString = phone.substring(8)
    println("XXX-XXX-$subString")
}