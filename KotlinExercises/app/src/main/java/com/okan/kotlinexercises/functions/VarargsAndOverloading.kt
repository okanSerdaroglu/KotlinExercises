package com.okan.kotlinexercises.functions

fun main() {
    findSumOfNumbers(2, 3)
    findSumOfNumbers(2, 3, 4, 5)
    findSumOfNumbers(arrayOf(1,2,4,5,6,46,465464))
}

fun findSumOfNumbers(i: Int, i1: Int): Int {
    return i + i1
}

fun findSumOfNumbers(arrayNumbers: Array<Int>): Int {

    var total = 0
    for (i in arrayNumbers) {
        total += i
    }

    return total
}

// vararg is a kind of array which includes int variables
// it is the same with ... in java
fun findSumOfNumbers(vararg numbers: Int): Int {
    var total: Int = 0
    for (number in numbers) {
        total += number
    }
    return total
}
