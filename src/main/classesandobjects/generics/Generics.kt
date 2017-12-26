package main.classesandobjects.generics

class Box<T>(t:T){
    var value= t

    val box:Box<Int> = Box<Int>(10)
    val box1 = Box(20) // Here the type is inferred
}