package com.prac.lec03

fun main() {
    // 코틀린에서 형변환을 하면 toLong()같이 to 메서드를 써야 한다.

    var num1: Int? = 4
    var num2:Long = num1?.toLong() ?:0L


}

fun printAgeIfPerson(obj: Any) {
    // is는 java의 instanceof 타입을 체크하는
    // 반대는 !is
    if(obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}