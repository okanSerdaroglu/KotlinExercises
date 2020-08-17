package com.okan.kotlinexercises.loops

fun main() {

    for (i in 1..10){
        println(i)
        if (i==7)
            break
    }

    for (j in "okanserdaroglu2@gmail.com"){
        if (j=='@'){
            break
        }
        print(j)
    }

    println()
    for (k in 1..10){
        if (k == 5)
            continue // 5 does not print

        if (k == 3)
            return

        println(k)
    }
    



}