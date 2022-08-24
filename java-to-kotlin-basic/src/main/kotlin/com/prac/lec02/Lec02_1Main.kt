package com.prac.lec02

fun main() {
    var person = Person("merlin")

    println(startsWithA(person.name))
    val aa = aaaa("me")
    println(aa)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}