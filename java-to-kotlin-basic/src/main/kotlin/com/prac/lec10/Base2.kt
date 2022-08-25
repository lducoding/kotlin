package com.prac.lec10

fun main() {
    val test = Derived2()
}
// 상위클래스 설계할 때 생성자나 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
open class Base2{
    open val number: Int
        get() {
            return 100
        }

    init {
        println("base")
        println(number)
    }
}

class Derived2(

) :Base() {
    override val number
        get() = 10
    init {
        println("derived")
    }
}