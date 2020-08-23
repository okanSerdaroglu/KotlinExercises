package com.okan.kotlinexercises.classes


fun main() {

    var okan: User = User("okan", 12)
    var osman: User = User("osman", 15, "address")
    println(osman.address)
    println(okan.address)

}


class User(name: String, id: Int) {

    var address: String = "-"

    // when you create a secondary constructor firstly you have to call default constructor
    constructor(name: String, id: Int, address: String) : this(name, id) {
        this.address = address
    }

    init {
        var id = id
        var name = name
        if (id < 5) {
            println("id smaller than 5")
        }
    }

}