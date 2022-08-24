package com.prac.lec01

fun main() {
     // var 은 가변 , val 은 불변
    var num1 = 10L
    val num2 = 10L

    // 기본적으로 타입은 생략가능하다. 명시하고 싶으면 명시도 가능하다.
    var num3: Long = 1_000L

    // 타입을 명시하면 값 세팅 안해도 됨
    var num3_1: Long

    // 기본적으로 null 값을 넣을 수 없다.
    // 넣으려면 ? 붙여야 한다.
//    var num3: Long? = 1_000L
//    num3 = null

    var person = Person("merlin")


}
