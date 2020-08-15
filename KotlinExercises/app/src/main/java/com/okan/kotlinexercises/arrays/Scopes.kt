package com.okan.kotlinexercises.arrays

var number: Int = 10

fun main() {

    // levelOne is visible in the second scope

    run {
        var levelOne : Int = 1
        {
            print(levelOne)
            var levelTwo : Int = 2
        }

        {
            //print(levelTwo) is not possible in this scope
            print(levelOne)
        }



    }


}