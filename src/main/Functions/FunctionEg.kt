package main.Functions

fun main(args: Array<String>) {

    val a = 5
    val b = 10
    println(sum(a,b))
    val c = 15
    val d = 20
    println(sum(c,d))
}

fun sum (a:Int,b:Int):Int{
    return a+b
}