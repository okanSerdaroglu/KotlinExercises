package com.okan.kotlinexercises.arrays

class Arrays {

    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    var characters: Array<Any> = arrayOf("okan",4,5)

    private fun printNumbers(number: ArrayList<Any>) {
        print(number[1])
        print(characters[2])
        print(number.size)

    }

}

