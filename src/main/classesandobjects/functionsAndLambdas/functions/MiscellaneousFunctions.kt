package main.classesandobjects.functionsAndLambdas.functions

//Top level functions, i.e, we dont need a class to hold a function
fun abc(){
    val x:Int = 10
    fun def(){  //--> Kotlin supports local functions, i.e., function inside a function
        x.toString()//--> inner functions can access local variables of outer function
    }
}

class dummy{
    fun dummyFunc(){ // --> called as member function, i.e, function defined inside a class

    }
}

/**
* Tail- recursive functions Example
 * -->  This allows some algorithms that would normally be
        written using loops to instead be written using a recursive
        function, but without the risk of stack overflow
 * */
tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

