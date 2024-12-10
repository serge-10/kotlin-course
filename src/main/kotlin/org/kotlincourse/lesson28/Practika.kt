package org.sergei.org.kotlincourse.lesson28

import java.io.File

fun main() {

    val mapOne = mapOf("string01" to 0.2, "string02 " to 3.3 )
    writeDataToFile(mapOne,"path/folder/folder/File.txt" )


    println( readFileToMap("path/folder/folder/File.txt" ))
}

fun creatFailDirectory(path: String){
    File(path).apply {
        if(path.endsWith("/", )){
            mkdirs()
        }else{
           parentFile.mkdirs()
            createNewFile()
        }

    }
}

fun writeDataToFile(map: Map<String, Double>, path1: String){
    val dataToString = map.map { "${it.key}=${it.value}" }.joinToString ( "\n" )
    creatFailDirectory(path1)
    File(path1)
}

fun readFileToMap(path2: String): Map<String, Double>{
    val file02 = File(path2).readLines()
    return file02.associate {
        val string1 = it.split("=")
        string1[0] to string1[1].toDouble()
    }
}