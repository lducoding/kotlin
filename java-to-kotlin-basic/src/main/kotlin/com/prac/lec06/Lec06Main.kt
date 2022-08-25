package com.prac.lec06

fun main() {
    // 코틀린에서의 for 문 사용
    val numbers = listOf(1L ,2L, 3L)
    for(num in numbers) {
        println(num)
    }
    // ++ 의 경우
    for(i in 1..5) {
        println(i)
    }
    // -- 의 경우
    for(i in 5 downTo 1) {
        println(i)
    }
    // 2칸씩 i+=2 의 경우
    for(i in 1..5 step 2) {
        println(i)
    }
    // while 과 do while은 자바와 똑같다.
    var i = 1
    while(i < 3) {
        println(i)
        i++
    }
}