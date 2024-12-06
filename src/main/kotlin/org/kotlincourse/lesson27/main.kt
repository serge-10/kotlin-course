package org.sergei.org.kotlincourse.lesson27

import java.io.File
// скол функции
fun main() {

    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    val l: MutableList<Int>.()-> Unit={
        println(list.size)
        list.add(3)
        println(list.size)
    }

    with(list) {
        println(size)
        add(4)
        println(size)
    }

    list.add(5)
    val result = list.sum()

    val result2 = list.run {
        add(5)
        sum()
    }
    val s = File("example.txt").inputStream()
    val content = s.readBytes()
    println(content)
    s.close()

    File("example.txt").inputStream().use {
        val content = it.readBytes()
        println(content.size)
    }

    val list4 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    val str: String? = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null
    }

    // практика

    val list11 = mutableListOf(1, 2, 3, 4)
    list11.add(6)
    println(list11)

    val list12 = list11.toList()

    val list21 = with(mutableListOf(1, 2, 3, 4)){
        add(6)
        println(this)
        toList()
    }

    val sb = StringBuilder()
    sb.append("ffjfjj")
    sb.append("jjfffjf")
    sb.append("jfjjfj")

    val strLength = sb.length

    val sb11 = StringBuilder().run {
        append("ffjfjj")
        append("jjfffjf")
        append("jfjjfj")
        length

    }

    val list33 = arrayListOf<String>()
    list33.add("jjf")
    list33.add("jjj")
    list33.add("ccc")

    val list333 = arrayListOf<String>().apply {
        add("jjf")
        add("jjj")
        add("ccc")
    }

    val string: String? = "JHGFFGHJJ"
    string?.length
    println(string?.length)
    println(string?.isEmpty())
    println(string?.uppercase())

    string?.let {
        println(string.length)
        println(string.isEmpty())
        println(string.uppercase())
    }
}