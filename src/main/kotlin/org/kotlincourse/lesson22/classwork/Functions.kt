package org.sergei.org.kotlincourse.lesson22.classwork

fun String.removeSpaces(): String {
    return replace(" ", "")
}
fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

fun String.funA(arg1: String, arg2: Int): Boolean{
    return true
}

fun List<Int>.funb(arg1:String?){

}
fun <K,V> Map<K,V>.func(arg1:K, arg2:V): Boolean{
    return true
}
fun Double?.fund(arg1:Double,arg2: String?):Double{
    return 0.0
}

fun<T> Set<T>.funE(arg1: T): List<T>{
    return listOf()
}
fun Double.format(): String{
    return "%,.2f".format(this)
}
fun String.wordcounter(): Int{
    return split(" ").size
}

fun <T> T.createList(n:Int): List<T> {
    return (0 until n).map { this }
}


fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()

    println("cgdd".funA("jjhg", 1))
    listOf(1,2,3).funb(null)
    mapOf("ddjdk" to "djjj", "djjd" to "ddjdj").func("ass", "ass")
    var num = 0.0
    println(num.fund(0.2, "hgg"))
    println(setOf("bhf", "njjg").funE("jgh"))

    var num3: Double = 58.12345
    println("%,.2f".format(num3))
    var str = "aa ahjha ahjah ajj"
    println(str.wordcounter())
    println(str.split(" ").size)

    var num4 = 133
    val list = listOf(num4)
    val list2 = listOf(num4, num4, num4)


    println(num.createList(8))
}

