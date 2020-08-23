package com.okan.kotlinexercises.classes

class Rectangle(lenght: Int = 0, height: Int = 0) {

    fun calculateArea(): Int {
        return lenght * height
    }
    // default values in constructor

    private var lenght: Int
    private var height: Int

    init {
        this.lenght = lenght
        this.height = height
    }

}

fun main() {

    var rectangle = Rectangle() // default values 0
    print(rectangle.calculateArea())

    var rectangle1 = Rectangle(
        lenght = 10,
        height = 10
    )



}