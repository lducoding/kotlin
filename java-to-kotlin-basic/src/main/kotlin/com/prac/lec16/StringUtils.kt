package com.prac.lec16

// 확장함수

fun main() {
    val name = "merlin"
    println(name.lastChar())
    // 확장함수와 멤버함수의 이름을 같게해서 만들면 멤버함수가 호출된다.
    val person = Person("lee","Uk", 22)
    println( person.nextYearAge() )
    // 확장함수는 현재 타입을 기준으로 호출된다.

}
// 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.

// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 { this를 이용해 실제 클래스 안의 값 접근 }
fun String.lastChar(): Char {
    // this를 통해 함수가 불려진 인스턴스를 가져온다.
    return this[this.length-1]
}

fun Person.nextYearAge(): Int {
    return this.age+100000
}