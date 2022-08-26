package com.prac.lec12

import com.prac.lec10.Animal
import com.prac.lec10.Cat

class Person private constructor(
    var name: String,
    var age: Int
) {

    // companion object 안에 넣어놓은 함수와 변수가
    // 자바의 static 붙인것과 같은 효과이다.
    // companion object도 객체이기 때문에 이름을 붙이거나 interface를 구현할 수도 있다.
    companion object Factory : Log {
        // 그냥 val 하면 런타임 시에 값이 할당되는데 const 하면 컴파일 시에 값이 할당된다.
        // 기본타입과 String 에만 붙일 수 있고 진짜 상수에만 사용
        private const val MIN_AGE = 1
    // 자바에서 kotlin의 companion object를 사용하려면 @JvmStatic붙여야 한다.
        // 그래야 java에서 static 쓰는거 처럼 된다.
        @JvmStatic
        fun newBaby(name:String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("동행객체도 인터페이스 구현이 가능")
        }
    }
}

// kotlin에서 싱글톤 사용
object Singleton {
    var a: Int = 0
}