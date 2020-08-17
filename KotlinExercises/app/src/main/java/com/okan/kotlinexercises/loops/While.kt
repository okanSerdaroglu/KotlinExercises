package com.okan.kotlinexercises.loops

fun main() {

    // while is using when the folder is open, while database is open

    for (i in 1..10){
        println("for $i")
    }

    var i = 0
    while (i<=10){
        println("while $i")
        i++
    }

    /**  find sum of the even numbers between 1 and 100 with for loop */

    var sum = 0
    for (i in 1..100){
        if (i%2==0){
            sum += i
        }
    }
    println("for $sum")

    var k = 1
    var whileSum = 0
    while (k <= 100){
        if (k%2 == 0) {
            whileSum += k
        }
        k++
    }
    println("whileSum $whileSum")

    var d = 0
    var doWhileSum = 0
    do {
        d++
        if (d%2==0)
        doWhileSum += d
    }while (d<=100)

    println("doWhileSum $doWhileSum")

}