package com.prac.lec20

fun main() {
    val strings = listOf("APPLE", "SAMSUNG")

    strings.map { str -> str.length }
        .filter { len -> len > 5 }
        .let (::println)

}