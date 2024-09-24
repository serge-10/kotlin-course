package org.sergei.org.kotlincourse.lesson5

class lesson5 {
}
//fun main() {
val sum = 10 + 5
val diff = 10 - 5
val product = 10 * 5
val quotient = 10 / 5
val remainder = 10 % 5
val remainder1 = 10 % 6
val remainder2 = 10 % 4
val isEqual = 5 == 4
val isNotEqual = (5 != 5)
val isGreater = (5 > 3)
val isLesser = (5 < 3)
val isLesserOrEqual = (5 >= 5)
val andResult = false && false
val orRfsult = true || false
val notResult = !(5 > 3)
var number = 5
//number += 3 // number + 3
//number -= 2
// println(sum)
//println(--number)

val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6)
// (3 + 2 < 6) && (4 * 2 == 8)  true && true = true
// (10 - 5 >= 5) || (2 * 3 != 6) true || false = false
// (8 / 2 == 4) && (7 % 3 != 1) true && false = false
// (9 - 3 >= 6) && (8 / 2 != 4) true && false = false
// ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1) (true && true) || false = true
// ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) (true || true) && false = true
// ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4) (true && true) ||true = true
// ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8) false
// ((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4) true
// (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5) false
// (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5)) true
// ((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6) true
// (var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0)) true

val name: String? = null

val result = name ?: "Unknown"

//}
// задача
fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println()
}

//fun main(){
//printPrice(prise: 123.8, s: null)
//printPrice(prise: null)
//}

// Задача
//fun printPrise(prise: Double, s: Int?){
//val koef = (100 - (s ?: 0)) / 100.0
//println(prise * koef)
//}

//fun printSitelang(lang: string?){
//val defaultlang: String = "Eng"
//println(lang ?: Defautlang)
//}
// задача
//fun main (){
//printBoxStuff(stuff: "rus")
//printBoxStuff(stuff: null)

//}
//fun printBpxStuff(stuff: String?){
//println(stuff ?: throw Exception("Box is empty"))

//}
