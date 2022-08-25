package com.prac.lec11

// protected는 파일 최상단에 사용 불가
// kt 파일에 클래스 없이 메서드만 있으면
// 파일명 클래스에 static 메서드가 있는거처럼 된다.
fun isDerectoryPath(path:String): Boolean {
    return path.endsWith("/")
}