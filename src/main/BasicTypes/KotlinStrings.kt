package main.BasicTypes

fun main(args: Array<String>){
    val myString = "Hello Friends!"

//    Each character in string can be accessible
    for(c in myString) {
        println(c)
    }

//    Triple Quotes
    val myTripleQuote = """
                |Hey Everyone!
                |Here is
                        |a sample Triple Quote Demo
        """.trimMargin()
    println(myTripleQuote)


//    String Templates

    val a = "Vamsi Tallapudi"
    val b = "Hey There $a"
    println(b)


//    using curly braces to call functions
    val randString = "Earth"
    println("$randString.length is ${randString.length}")


}
