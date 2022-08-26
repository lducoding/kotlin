package com.prac.lec16

// inline 함수
// 함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
// 오버헤드를 줄일 수 있지만 성능 때문에 신중히 사용해야함

fun main() {
    // 여기에 add 함수 본문이 그대로 들어온다.
    add(45)
}

inline fun add(other: Int): Int {
    return other + 5
}