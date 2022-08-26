package com.prac.lec14

fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    ;
}

sealed class HyundaiCar(
    val name: String,
    val price: Int
)

class Avante : HyundaiCar("아반떼", 2000)
class Sonata : HyundaiCar("소나타", 3000)
class Grandeur : HyundaiCar("그렌저", 4000)

fun handleCar(hyundaiCar: HyundaiCar) {
    when(hyundaiCar) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}