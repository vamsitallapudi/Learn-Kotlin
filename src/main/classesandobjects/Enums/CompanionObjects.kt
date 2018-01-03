package main.classesandobjects.Enums

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}
class MyClass2 {
    companion object {
//        fun create():MyClass2 = MyClass2()
    }
}

fun main(args: Array<String>) {
    val instance = MyClass.create()
    val x =  MyClass.Factory
    val y = MyClass2.Companion
}