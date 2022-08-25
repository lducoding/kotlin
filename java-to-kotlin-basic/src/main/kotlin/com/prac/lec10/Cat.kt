package com.prac.lec10

// 코틀린에서 상속은 extends가 아닌 : 을 사용 앞에 한칸띄우는거로 구분
class Cat(
    species: String
) : Animal(species, 4) {

    // 오버라이드도 지시어로 사용
    override fun move() {
        print("사뿐 사뿐 걸어가")
    }
}