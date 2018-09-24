package main.standardFunctions

fun testScope(){
    var name = "Hi Vamsi"
    run{
        var name = "Hello there"
        println(name) //Hello there
    }
    println(name) // Hi Vamsi
}

fun main(args: Array<String>) {
    testScope()
    runEg()
}

fun runEg(){
    val str ="Hello Vamsi"
    str.run {
//        do some series of action on str variable
        println(toUpperCase()) // --> notice that we've directly called methods on string without object reference
        println(split(" ")[1])
        println(length)
    }
}
