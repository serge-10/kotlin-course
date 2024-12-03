package org.sergei.org.kotlincourse.Lesson26

fun processWebData(
    query: String,
    fetcher: (String) -> List<Map<String, Any>>,
    transformer: (List<Map<String, Any>>) -> List<User>,
    displayer: (List<User>) -> Unit
) {
    val rawData = fetcher(query)
    val transformedData = transformer(rawData)
    displayer(transformedData)
}

data class User(val name: String)

fun main() {

    val fetcher: (String) -> List<Map<String, Any>> = {
        // orm.select(it).map { listOf() }
        listOf(mapOf("Andrey" to "5"))
    }

    val transformer: (List<Map<String, Any>>) -> List<User> = {
        it.map { map -> User(map.keys.first()) }
    }

    val displayer: (List<User>) -> Unit = {
        println(it)
    }

    processWebData("sql query", fetcher, transformer, displayer)


    val name: (Int) -> String = {
        it.toString() + "5"
    }
    function1(name)

    val name2: (Int)-> String ={
        "${it + 5}"
    }
    function1(name2)
}


fun function(
    arg1:()-> Unit){

}

fun function1(arg2: (Int) -> String){

    println(arg2(56))
}

fun <T> Function3(arg: List<T>, arg1: (List<T>) -> T): T{
    return arg1(arg)
}