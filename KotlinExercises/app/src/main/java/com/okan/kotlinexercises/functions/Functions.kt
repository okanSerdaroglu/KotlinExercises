package com.okan.kotlinexercises.functions

fun main() {

    printName()
    printNameWithParameter("okan")
    println(findSum(4, 5))
    println(findFactorial(5))
}

fun findSum(x: Int, y: Int): Int {
    return x + y
}

fun printNameWithParameter(name: String) {
    println("okan")
}

fun printName() {
    println("okan")
}

fun findFactorial(x: Int): Int {

    var factorial = 1
    for (i in 2..x){
        factorial *= i
    }
    return factorial
}