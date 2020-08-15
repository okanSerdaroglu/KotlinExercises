package com.okan.kotlinexercises.arrays

fun main() {
    println("enter your name")
    var name: String? = readLine() // name can be null with ? operator. However readLine returns ""
    println("enter your surname")
    var surname: String = readLine()!!
    // We can use !! operator safely because readLine does not return null value
    println("enter your age")
    var age : Int = readLine()!!.toInt()

    println("name $name surname $surname age $age")

}