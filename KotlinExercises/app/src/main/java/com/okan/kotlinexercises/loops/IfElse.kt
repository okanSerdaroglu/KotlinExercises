package com.okan.kotlinexercises.loops

fun main() {

    /*
    var age: Int = 17
    if (age < 18) {
        println("age is smaller then 18")
    } else {
        println("age is greater then 18")
    }*/

    println("enter your note")
    var note: Int = readLine()!!.toInt()

    var result : Int = 0
    result = if (note in 1..44){
        println("1")
        1
    } else if (note in 44..55){
        println("2")
        2
    } else if (note in 55..70){
        println("3")
        3
    } else if (note in 70..85){
        println(4)
        4
    } else if (note in 85..100){
        println("5")
        5
    } else {
        println("enter number between 1 and 100")
        print(result)
        6
    }

    /*when (note) {
        in 1..44 -> {
            println("1")
        }
        in 44..55 -> {
            println("2")
        }
        in 55..70 -> {
            println("3")
        }
        in 70..85 -> {
            println(4)
        }
        in 85..100 -> {
            println("5")
        }
        else -> {
            println("enter number between 1 and 100")
        }
    }*/

}