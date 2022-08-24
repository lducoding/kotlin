package com.prac.lec02

fun main() {
    var person = Person("merlin")

    println(startsWithA(person.name))
    val aa = Aaaa("me")
    println(aa)
}

fun startsWithA(str: String): Boolean {
    val startsWith: Boolean = "ABC".startsWith("A")

    return str.startsWith("A")
}