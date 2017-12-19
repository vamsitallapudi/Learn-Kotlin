package main.classesandobjects

fun main(args: Array<String>) {
    //  Extension functions
    fun Rabbit.snore(){
        println("I am Rabbit, I am snoring")
        walking =true
    }

    val rabbit = Rabbit()
    rabbit.sleep()

//    power of extension functions-->
//    we can declare a function for any class
//    and use it as if it were a function available within
//    that class
    rabbit.snore() //--> Valid
}