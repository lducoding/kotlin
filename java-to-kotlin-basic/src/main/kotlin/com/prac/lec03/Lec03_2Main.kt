package com.prac.lec03

fun main() {
    val person = Person("merlin", 29)

    println("이름: ${person.name} 나이: ${person.age}")

    val str = """
        이동욱
        29세
        백엔드 개발자
    """.trimIndent()

    println(str)

    val abc = "ABC"
    println(abc[0])
    println(abc[2])
}