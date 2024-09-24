package org.sergei.org.kotlincourse.lesson7

//fun main() {
    //for (i in 1..10) {
        // тело цикла
       // println(i)
   // }
//}
//for (i in 10 downTo 1) {
//    println(i)
//}

//for (i in 1..10 step 5) {
//    println(i)
//}

//fun main() {
   // do {
       // println("+")
    ///} while (false)

    //while (false) {
        // тело цикла
   // }
//}

//fun main() {
//    for(i in 1..10){
 //       if (i == 2) continue
//        if (i == 7) break
//        println(i)
 //   }
//}

// практика

//fun main(){
//    for (i in 1..10){
//        println(i)
//    }

//}


fun qvadrat(){
    for(i in 1..5){
        println(i*i)
    }

    for (i in 10..1){
        println(i)
    }

    for (i in 20..2){
        if (i % 2 ==0) {
            println(i)
        }
    }

    for (i in 1..30 step 3){
        println(i)
    }


//    var  sum = 0
//    //var count = 1
//    while(count <= 10){
//        sum = count + sum
//
//    }
//    println(sum)

    var countr = 100

    while (countr >= 1){
        println(countr--.toString().length)
    }
}

