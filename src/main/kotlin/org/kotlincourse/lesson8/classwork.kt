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
//    val originalString = "Kotlin is fun"
//    val subString = originalString.substring(startIndex = 7)
//    val suString2 = originalString.substring(3 ,6)
//    val replacedString = originalString.replace(oldValue = "n", newValue = "w")
//    val words = originalString.split(...delimiters;"is")
//    val Length = "Hello". length
//    val upper = "hello".uppercase()
//    val Lower = "Hello".lowercase()
//    val trimmed: String
//    trimmed = "   hello  ".trim()
//    val trimmed = "   hello  .".startsWith(prefix= "Kot")
//    val ends = "Kotlin".endsWith(other= "ell")
//    val contains = "Hello".contains(other= "ell")
//    val e: String? = null
//    val empty = e.isNullOrEmpty()
//    val blank = "   ".isNotBlank()
//    val repeat = "ab".repeat(n=3)
//    val letter = originalString[5]
//    val indexOfChar = "Kotlin".indexOf(char = 't')
//    val indexOfWord = "Kotlin is the best language".indexOf("best")
//    val backReverse = "niltoK".reversed()
//    val multiLineString = """
//                        Первая строка
//                        Вторая строка
//                        Третья строка
//                        """.trimIndent()
//
//    val string = "sweet suummer child"
//    val subString = string.substring(steartindex = 6)
//    val subString1 = string.substring(6, 12)
//
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