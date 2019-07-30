package com.example.kotlintraining

abstract class Mammal(name: String, age: Int) {

    private var age: Int = age
        set(value) {
            if (value != field) {
                field = value
            }
        }


    val name: String = name
        get() {
            return "name : " + field
        }


    abstract fun someMethod()

    open fun walk() {

        val a = age * 2


    }

}

class Dog(name: String, age: Int) : Mammal(name, age) {

    override fun someMethod() {

    }

    override fun walk() {

    }
}


