package com.prac.lec02

fun main() {
    var str: String? = null

    // safe call null이 들어갈 수 있다면 원래 바로 호출이 불가능하지만
    // 아래처럼 호출하면 null 이면 그냥 null로 처리, not null 일때는 정상적으로 호출한다.

    print(str?.length)

    // elvis null일 경우에 ?: 뒤의 값으로 리턴
    print(str?.length ?: -9)


}

fun startsWithA1(str: String?): Boolean {

    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔다.")

//    if(str == null) {
//        throw IllegalArgumentException("null이 들어왔다.")
//    }
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {

    return str?.startsWith("A")

//    if(str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {

    return str?.startsWith("A") ?: false

//    if(str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

// nullable 이지만 절대 null이 들어갈 수 없는 경우 !!이용해서 null 처리 없이 사용가능하다.
// 하지만 null이 들어간다면 npe 뜬다.
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}