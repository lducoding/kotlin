package com.prac.lec10

fun main() {
    val test = Derived(50)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("base")
        println(number)
    }
}

class Derived(
    override val number: Int
) :Base(number) {
    init {
        println("derived")
    }
}