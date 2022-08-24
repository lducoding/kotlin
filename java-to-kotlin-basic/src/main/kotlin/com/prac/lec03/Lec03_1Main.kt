package com.prac.lec03

fun main() {
    printAgeIfPerson(null)
}

// Any는 자바의 Object 라고 보면 된다.
fun printAgeIfPerson(obj: Any?) {
    // as? 는 null 이 아니라면 뒤에 타입으로 간주, null 이면 null
    val person = obj as? Person
    println(person?.age)

    // Unit 은 자바의 void 와 같다.
}