package com.okan.kotlinexercises.functions

fun main() {

    var menuID = showMenu()

    println("Enter Your First Number")
    var firstNumber = readLine()!!.toInt()

    println("Enter Your Second Number")
    var secondNumber = readLine()!!.toInt()

    when (menuID) {
        1 -> addNumbers(
            numberOne = firstNumber,
            numberTwo = secondNumber
        )
    }

}

fun addNumbers(numberOne: Int, numberTwo: Int): Int {
    println("Sum of $numberOne and $numberTwo = " + (numberOne + numberTwo))
    return numberOne + numberTwo
}

fun showMenu(): Int {

    println("------ Menu --------")

    println("1 - Sum")
    println("2 - Difference")
    println("3 - Multiplication")
    println("4 - Division")
    println("5 - Exit")

    println("******")

    println("Enter your choice")
    return readLine()!!.toInt()

}