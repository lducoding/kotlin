package com.prac.lec10

abstract class Animal(
    protected val species: String,
    // 프로퍼티에 대한 오버라이드를 할 때는 open을 붙여야 한다.
    // 기본적으로 final 이 기본값으로 있어서 그렇다.
    protected open val legCount: Int
) {

    abstract fun move()

}