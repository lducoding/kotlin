package com.prac.lec02

fun main() {
    var person = Person("merlin")

    println(startsWithA(person.name))
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}