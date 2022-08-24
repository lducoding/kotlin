package com.prac.lec02

data class Aaaa (
    var name:String? = null

) {
    fun test(person: Person): Aaaa {
        Aaaa("merlin").name = "eeee ${person}"

        return Aaaa(person.name)


    }
}
