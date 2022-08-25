package com.prac.lec05

fun main() {

}

// 코틀린에서는 if-else 구문이 expression 즉 하나의 값이어서 바로 리턴이 가능하다
fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}
// if else-if else 또한 마찬가지
fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}
// if 조건 안에 범위를 표현할 경우 (변수 in 0..100) 이런식으로 사용가능
fun validationScoreIsNotNegative(score: Int): Unit {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}가 0보다 작다!")
    }
}
// 코틀린에는 switch case 가 없고 when 절로 사용한다.
fun getGradeWithSwitch(score: Int): String {
    return when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        0 -> "F"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(num: Int) {
    when(num) {
        1, 0, -1 -> println("1, 0, -1이다.")
        else -> println("1, 0, -1이 아님")
    }
}
// when에 값을 안 넣어도 가능
fun judgeNumber2(num: Int) {
    when {
        num == 0 -> println("0이다")
        (num % 2) == 0 -> println("짝수이다.")
        else -> println("홀수다")
    }
}