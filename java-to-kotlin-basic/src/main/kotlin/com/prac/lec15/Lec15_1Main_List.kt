package com.prac.lec15

fun main() {
    // 코틀린에서 콜렉션 사용
    val lists = listOf(100,200)
    // emptyList같은 빈 콜렉션이면 타입을 미리 정의해야한다.
    val emptyList = emptyList<Int>()
    // 하지만 타입을 예측할 수 있다면 생략가능하다.
    guessColle(emptyList())
}

fun guessColle(llist: List<Int>) {

}