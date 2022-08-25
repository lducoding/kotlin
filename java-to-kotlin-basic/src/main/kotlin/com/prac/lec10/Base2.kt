package com.prac.lec10

fun main() {
    val test = Derived2()
}

open class Base2{
    open val number: Int
        get() {
            return 100
        }

    init {
        println("base")
        println(number)
    }
}

class Derived2(

) :Base() {
    override val number
        get() = 10
    init {
        println("derived")
    }
}