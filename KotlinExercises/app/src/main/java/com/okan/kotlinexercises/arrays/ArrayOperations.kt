package com.okan.kotlinexercises.arrays

fun main() {

    /** copy an array */
    var array1 = arrayOf(10, 20, 30, 40, 50)
    var array2 = Array(5) { 0 } // default element of this array is 0

    var array3 = arrayListOf(1,2,3,4,5,6)

    for (i in array1.indices) {
        array2[i] = array1[i]
    }

    for (i in array2.indices) {
        println("array2 $i element is : " + array2[i])
    }

    // System.arraycopy(array1,0,array2,0,array1.size) Copy an array to another

    println(array1.contentEquals(array2))

    //array3.clear()
    array3.add(0,2)
    for (i in 0 until array3.size){
        println("array3 " + array3[i])
    }




}