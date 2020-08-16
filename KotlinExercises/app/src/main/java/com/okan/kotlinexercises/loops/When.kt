package com.okan.kotlinexercises.loops

fun main() {

    println("enter your note")
    when (readLine()!!.toInt()) {
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
    }

}