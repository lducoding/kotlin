package com.prac.lec12

fun main() {
    // 익명 클래스를 이용할 떄 object 사용
    moveSomething(object : Movable {
        override fun move() {
            println("무브무브무브")
        }

        override fun fly() {
            println("플라이 날다")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}