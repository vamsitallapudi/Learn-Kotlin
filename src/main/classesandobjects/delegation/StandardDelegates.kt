package main.classesandobjects.delegation

val lazyValue : String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("Computing")
    "Kotlin" // --> acting as getter(mandatory)
}

fun main(args: Array<String>) {
    print(lazyValue)
    print(lazyValue)
}