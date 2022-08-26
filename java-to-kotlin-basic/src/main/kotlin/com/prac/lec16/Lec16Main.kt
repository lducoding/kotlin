package com.prac.lec16

// 지역함수
// 함수 안에 함수를 만드는 것

// 함수로 추출하면 좋을거 같은데 이 함수 내에서만 사용하고 싶다면
// depth 가 깊어지고 코드가 깔끔하지 않다.

fun createPerson(firstName: String, lastName: String) {
    fun valildateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("erorrororor")
        }
    }
}