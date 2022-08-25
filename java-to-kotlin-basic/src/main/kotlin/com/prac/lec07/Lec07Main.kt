package com.prac.lec07

import java.io.BufferedReader
import java.io.FileReader

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

// try catch 또한 하나의 expression 으로 간주되어 한번에 return 가능하다.
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 코틀린은 모두 Unchecked Exception이다. try catch가 필수이거나 throws로 처리할 필요 없다.
// try with resources (알아서 자원반납 close까지하는 구문) 이 없고 use 를 사용한다.
fun readFile(path: String) {
    val reader = BufferedReader(FileReader(path)).use { reader ->
        println(reader)
    }
}