package com.prac.lec16

// infix 함수
// 보통의 함수 호출은 변수.함수이름(argument) age.getAge(3)
// infix는 변수 함수이름 argument age get 3
// infix는 멤버함수(클래스 안에 있는 함수)나 확장함수에 사용가능

fun main() {
    val tt = Test()
    tt.fix2(3)
}

class Test {

    fun fix(age: Int): Int {
        return 4
    }

    infix fun fix2(age: Int): Int {
        return 7
    }
}
