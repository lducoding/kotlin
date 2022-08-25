package com.prac.lec09

fun main() {
    val person = Person("merlin", 29)
    println(person.name + person.age)

    val person2 = Person()
}

// 코틀린에서 주 생성자는 클래스명 옆에 constructor 붙이면 된다 (생략가능)
// 생성자에서 바로 프로퍼티 생성 가능
class Person (
    name:String,
    var age:Int
    ) {

    // name 이라고 하면 name의 get()을 호출해서 get() = name이면 또 get()을 호출하고 무한루프에 빠진다.
    // 그걸 방지하고자 field사용가능
//    val name = name
//        get() = field.uppercase()

    // 커스텀 get 사용 시
    val upperCaseName: String
        get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    // 클래스가 초기화되는 시점에 한번 실해되는 블록 생성자 호출 때 호출한다.
    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다")
        }
        println("초기화 블록")
    }
    // 부 생성자의 경우 constructor로 정의 할 수 있다.
    // 부 생성자는 최종적으로 주 생성자를 this로 호출해야 한다.
    // body를 가질 수 있다.
    // 추가 생성자 보다는 default 사용하는 걸 권장한다.
    constructor(name: String): this(name,1) {
        println("첫번째 부생성자")
    }
    constructor(): this("mem") {
        println("두번째 부생성자")
    }

    // 함수를 생성하거나
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // 프로퍼티를 만들면서 getter 활용할 수 있다.
    val isAdult: Boolean
        get() = this.age >= 20
}