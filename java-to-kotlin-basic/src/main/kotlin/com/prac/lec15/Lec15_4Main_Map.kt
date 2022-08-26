package com.prac.lec15

fun main() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1,"one")
    oldMap[2] = "two"

    var newMap = mapOf("one" to 1, "two" to 2)

    for(key in oldMap.keys) {
        println(key)
    }

    for((key, value) in newMap.entries) {
        println("${key}는 ${value}발")
    }
}