package com.okan.kotlinexercises.arrays

fun main() {

    var name: String? = null // name is a String variable however it can be null
    println(name)
    println(name?.length)
    // name can be null, therefore we have to put question mark operator for null safety
    // If you use !! operator you say that don't worry it is not null.

    var number : Int? // ? means number can be null, normally integer values can not be null in kotlin
    number = null
    println(number.toString().length)
    println(number)
    number = 5
    println(number)

}