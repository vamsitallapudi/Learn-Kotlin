package main.ClassesAndObjects

fun main(args: Array<String>) {
//    var tiger = Tiger()
//    tiger.sleep()


//  Extension functions
    fun Rabbit.snore(){
        println("I am Rabbit, I am snoring")
        walking =true
    }

    var rabbit = Rabbit()
    rabbit.sleep()

//    power of extension functions-->
//    we can declare a function for any class
//    and use it as if it were a function available within
//    that class
    rabbit.snore() //--> Valid

}