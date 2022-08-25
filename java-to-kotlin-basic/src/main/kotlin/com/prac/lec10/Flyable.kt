package com.prac.lec10

interface Flyable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("날아라 슈퍼보드")
    }
}