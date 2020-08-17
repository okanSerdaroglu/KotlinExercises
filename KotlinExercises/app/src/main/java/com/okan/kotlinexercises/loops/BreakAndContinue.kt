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
            //return

        println(k)
    }

    println()
    // break is in the inner for loop, when I write break in the inner loop
    // only this breaks. However I want to break all loop. Therefore I have to
    // give name the loops.

    outerLoop@ for (i in 4..6){
        for (j in 1..3){
            if (i*j == 12){
                break@outerLoop // breaks all the looping operation
            }
            println("$i * $j : " + (i*j))
        }
    }




}