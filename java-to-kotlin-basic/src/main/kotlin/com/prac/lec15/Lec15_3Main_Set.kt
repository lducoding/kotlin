package com.prac.lec15

fun main() {
    // 기본적으로 immutable 불변이기 때문에 add가 불가능
    val sets = setOf(100,200)
    // mutable로 바꾸면 가변으로 된다.
    val musets = mutableSetOf(1,2,3,4,54,5,)
    musets.add(10)

    for(set in sets) {
        println(set)
    }

    // index 와 value를 한번에 가져오는것도 가능
    for ((index,value) in sets.withIndex()) {
        println("${index}는  ${value}")
    }
}