package main.classesandobjects.functionsAndLambdas.functions

fun main(args: Array<String>) {
    printHello(null)
    printHello("Vamsi")
}

fun printHello(name:String?){
    if(name!=null) {
       println("Hello $name!")
    } else {
        println("Hello World")
    }
}