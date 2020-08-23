package com.okan.kotlinexercises.classes

class Circle(var radius: Int = 0) {

    fun calculateArea(): Double {
        return radius * radius * Math.PI
    }

}

fun getCircleArray(circleList: ArrayList<Circle>) {

    /*for (circle in circleList){
        println(circle.calculateArea())
    }*/

    for (i in 0 until circleList.size) {
        println(circleList[i].calculateArea())
    }

}

fun main() {

    var circleList: ArrayList<Circle> = ArrayList()
    val circle1 = Circle(5)
    val circle2 = Circle(15)
    val circle3 = Circle(25)
    val circle4 = Circle(35)
    val circle5 = Circle(45)

    circleList.add(circle1)
    circleList.add(circle2)
    circleList.add(circle3)
    circleList.add(circle4)
    circleList.add(circle5)

    getCircleArray(circleList)

}