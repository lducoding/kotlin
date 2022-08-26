package com.prac.lec14

fun main() {
    val dto1 = PersonDto("이동욱", 20)
    val dto2 = PersonDto("이동욱", 20)
    println(dto1)
    println(dto1==dto2)
}

data class PersonDto(
    val name: String,
    val age: Int
)