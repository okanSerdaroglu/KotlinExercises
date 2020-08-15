package com.okan.kotlinexercises.arrays

fun main (){

    var numbers = 1..20 // integer range

    var characters = 'a'..'z' // char range

    var numberList = 20 downTo 1 // down range

    var oneToTwenty = 1.rangeTo(20) // 1..20

    var oneToHundred = 0.rangeTo(100).step(5) // 1 to 100 step 5

    var isAvailableInList = 11 in numbers // returns a boolean value if 11 available

}