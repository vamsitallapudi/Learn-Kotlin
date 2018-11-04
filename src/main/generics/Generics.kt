package main.generics

fun main(args: Array<String>) {
    val intBox = Box(1)
    println(intBox.value)
}

class Box<T> (t:T) {
    val value = t
}