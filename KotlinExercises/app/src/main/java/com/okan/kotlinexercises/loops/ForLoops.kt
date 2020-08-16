package com.okan.kotlinexercises.loops

fun main() {

    /**for (x in array, list , String , range)*/

    for (i in 1..10){
        println("okan")
    }

    var name = "okan"

    for (i in name){
        if (i != name.last()){
            print("$i,")
        } else {
            print(i)
        }
    }
    var sum : Int = 0
    println()
    for (i in 1..10){
        sum += i
        if (i == 10)
        print(sum)
    }

}