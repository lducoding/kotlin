package com.prac.lec10

fun main() {
    val pp = Penguin("펭")

}

class Penguin(
    species: String
) :Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 귀여워")
    }

    override val legCount: Int
        get() = super.legCount + this.legCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 7


}