package com.prac.lec04

fun main() {

    // 코틀린에서는 비교 연산자가 비교시 자동으로 compareTo를 호출한다.
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)

    if(money1<money2) {
        println("2가 더 크다.")
    }

    val javaMoney1 = JavaMoney(100L)
    val javaMoney2 = javaMoney1
    val javaMoney3 = JavaMoney(100L)

    // 주소값 비교는 ===
    println(javaMoney1 === javaMoney2)

    // == equals를 자동으로 호출해서 비교해줌
    println(javaMoney1 == javaMoney3)
}