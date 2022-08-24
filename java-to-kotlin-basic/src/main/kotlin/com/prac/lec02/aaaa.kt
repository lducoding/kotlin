package com.prac.lec02

data class aaaa(
    var name:String? = null

) {
    fun test(person: Person): aaaa {
        aaaa("merlin").name = "eeee ${person}"

        return aaaa(person.name)


    }
}
