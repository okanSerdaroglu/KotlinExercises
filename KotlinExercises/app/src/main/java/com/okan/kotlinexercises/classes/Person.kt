package com.okan.kotlinexercises.classes

fun main() {

    var person = Person()
    var student = Student("okan", 6, 6)
    print(person.name + " " + person.age)
}

class Student /*constructor*/(name: String, age: Int, id: Int) { // constructor

    var name: String
    var age: Int
    var id: Int

    init { // init works when class instance created
        this.name = name
        this.age = age
        this.id = id

        println("init worked")
        println("$name $age $id")
    }

}

class Person {

    var name = "okan"
    var age = 32

}