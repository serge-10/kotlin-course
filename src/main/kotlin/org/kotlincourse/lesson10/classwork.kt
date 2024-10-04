package org.sergei.org.kotlincourse.lesson10

fun main(){
    //массивы
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5){ "" }
    val emptyNullableArray = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c")

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    //методы

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("u1")
    println(readOnlyList[1])

//    val set = setOf("k", "o", "t", "l", "i", "n")
//    for (letter in set) {
//        println("| $letter |")


        val list = listOf(32, 53,1, -76)
        for (index in list.indices) {
            if (index == list.lastIndex) {
                println(list[index] + list[0])
            } else {
                println(list[index] + list[index + 1])
            }
        }

    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }

    val array1: Array<Int> = Array(size = 100) {0}   //создание массива
    val arrayDouble: DoubleArray = doubleArrayOf(1.0 , 2.0, 3.0, 4.0, 5.0)

    val array2 = Array(10) {0}
    array2[0] = 10
    for(i in array2.indices){
        array2[i] = (i + 1) * 10
    }
    println(array2.toList())

    val array3 = arrayOf("jo", "nj", "jkij", "m")
    for (i in array3.indices){
        array3[i] = " "
    }
    println(array3.toList())

    val array4 = arrayOf(1, 2, 3)
    val array5 = arrayOf(5, 6, 7)
    val emtyArray = Array(3) {0}
    for (i in emtyArray.indices){
        emtyArray[i] = array4[i] + array5[i]
    }

    val list1 = listOf<Int>()   // пустой список неизменяемый

    val list2 = listOf("f", "s", "f")
    for(i in list2) {
    }


    val mutableList1 = mutableListOf<Float> ()

    mutableList1.add(45f)
    mutableList1.add(54f)

    mutableList1.remove(45f)
    mutableList1.removeAt(0)
    println(mutableList1)

    val emptySet1 = setOf<Int>()

    val setNum = setOf(1, 2, 3, 4)
    val setNum2 = mutableSetOf(1, 2, 3)

    setNum2.add(6)
    setNum2.remove(2)
    println(setNum2)

    for (elem in setNum2){
        println(elem * elem)
    }

    val set2 = setOf(1, 2, 3)
    val set3 = setOf(3, 5, 6, 7)
    val emtySet = mutableSetOf<Int>()

    for (elem in set2){
        emtySet.add(elem)
    }

    for (elem in set3){
        emtySet.add(elem)
    }
    println(emtySet)



}

fun findNumber(setNum: Set<Int>, num: Int): Boolean{
    for (elem in setNum){
        if (elem == num){
            return true
        }

    }
    return false
}