package main.higherOrderFunctions

fun main(args: Array<String>) {
    val areaOfSquare = area()
    println(areaOfSquare(5))
    println(areaOfSquare(10))
}

fun area() : (Int) -> Int {
    return {i -> i * i}
}

