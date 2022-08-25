package com.prac.lec08

fun main() {
    repeat("merlin")
    // default 값은 생략이 가능하지만 만약에 num 만 default 값 쓰고 싶다면??
    // 어떤 파라미터가 생략된 건지 모르기 때문에 named argument 사용
    // builder 를 사용하지 않고 builder를 사용한 것 과 같음
    repeat("merlin", useNewLine = false)

    // 값을 넣을 수도 있고 배열을 넣을 수 있다.
    // 배열을 넣으려면 앞에 *붙인다.
//    printAll("A","B","C")
    val arr = arrayOf("A","B","C")
    printAll(*arr)

}

// = 을 사용하는 경우 반환타입의 생략이 가능하다.
fun max(a: Int, b: Int) = if (a > b) a else b

// 파라미터 값이 여러개인데 default 값을 지정할 수 있다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i: Int in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 가변인자를 만들어 줄 때 파라미터 앞에 vararg 붙인다
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}