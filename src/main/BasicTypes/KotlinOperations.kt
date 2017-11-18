package main.BasicTypes

fun main(args: Array<String>) {
    val a = 9
    val b = 12

//    Comparision
    println(a>b) //-> Valid
    println(a==b) //-> Valid
    println(a<=b)//-> Valid
    println(a>=b) //-> Valid

//    Range
    val x = 11

    println(x in a..b)

//    Bitwise Operations

    println(a and b)


}