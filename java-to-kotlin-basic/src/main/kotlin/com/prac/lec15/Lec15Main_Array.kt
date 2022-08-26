package com.prac.lec15

fun main() {
    // 코틀린에서 배열 쉽게 생성
    val array = arrayOf(100,200)
    // 배열에 추가
    array.plus(300)

    // 인덱스를 가져오는
    for(i in array.indices) {
        println("${i+1} 번째는 ${array[i]}")
    }

    // index 와 value를 한번에 가져오는것도 가능
    for ((index,value) in array.withIndex()) {
        println("${index}는  ${value}")
    }
}