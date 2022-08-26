package com.prac.lec15

fun main() {
    // 기본적으로 immutable 불변이기 때문에 add가 불가능
    val lists = listOf(100,200)
    // mutable로 바꾸면 가변으로 된다.
    val mulists = mutableListOf(1,2,3,4,54,5,)
    mulists.add(10)

    for(list in lists) {
        println(list)
    }

    for(i in lists.indices) {
        println("${i+1} 번째는 ${lists[i]}")
    }

    // index 와 value를 한번에 가져오는것도 가능
    for ((index,value) in lists.withIndex()) {
        println("${index}는  ${value}")
    }
}