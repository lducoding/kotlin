package com.prac.lec11

class Car(
    // name에 대한 getter 접근제어 하고 싶다면
    internal val name: String,
    // owner에 대한 getter, setter에 접근제어 설정 하고 싶다면
    private var owner: String,
    _price: Int
) {
    // setter 에만 하고싶다.
    var price = _price
        private set
}