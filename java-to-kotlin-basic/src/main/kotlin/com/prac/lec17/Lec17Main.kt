package com.prac.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과",1000),
        Fruit("사과",1000),
        Fruit("사과",1000),
        Fruit("사과",1000),
        Fruit("바나나",3000),
        Fruit("바나나",3000),
        Fruit("바나나",3000),
        Fruit("수박",10000)
    )
// 림다를 만드는 방법 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
   }

    // 타입을 지정하면
//    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
//        return fruit.name == "사과"
//    }

    // 람다를 만드는 방법 2
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 호출하기
    isApple(fruits[2])
    isApple2.invoke(fruits[3])

    // 코틀린에서 filterFruits 만들기
    fun filterFruits(fruit: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
        val results = mutableListOf<Fruit>()
        for (fruit in fruits) {
            if(filter(fruit)) {
                results.add(fruit)
            }
        }
        return results
    }

    // 변수에 담으니깐 당연히 이렇게 호출이 가능하다
    filterFruits(fruits, isApple)

    //만약에 마지막 파라미터가 함수라면 {} 바깥으로 뺄 수 있다.
    filterFruits(fruits) {fruit -> fruit.name == "사과" }
    // 심지어 fruit -> fruit 를 it으로 줄일 수 있다.
    filterFruits(fruits) {it.name == "사과" }

    // 코틀린은 closure 구조를 가지는데
// closure란
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) {it.name == targetFruitName}
    // 위 코드가 자바에서는 안됨

}