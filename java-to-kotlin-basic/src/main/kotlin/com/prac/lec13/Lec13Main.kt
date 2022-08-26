package com.prac.lec13

// 클래스 안의 클래스 : 바깥 클래스 참조 없음 권장되는 유형
// 클래스 안의 inner 클래스 : 바깥 클래스 참조 있음
class House(
    val address:String,
    val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}