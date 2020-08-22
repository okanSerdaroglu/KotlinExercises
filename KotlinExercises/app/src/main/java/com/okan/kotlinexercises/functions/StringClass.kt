package com.okan.kotlinexercises.functions

fun main() {

    var name = "okan"
    println(name + "1")

    var number = "1"

    println(number.toInt() + 1)

    for (character in name){
        println(character)
    }

    for (character in name.indices){ // character in 0..name.lenght - 1
        print(character)
    }

}