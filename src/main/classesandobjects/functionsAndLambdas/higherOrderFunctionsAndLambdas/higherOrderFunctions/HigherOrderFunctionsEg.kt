package main.classesandobjects.functionsAndLambdas.higherOrderFunctionsAndLambdas.higherOrderFunctions

import main.classesandobjects.objectExpressionsAndDeclarations.value
import java.util.concurrent.locks.Lock

/**
 * Higher order Functions -> Function that takes function as a parameter or returns a function
 *
* */

fun <T> lock(lock: Lock, body:() -> T) :T {
    lock.lock()
    try{
        return body()
    } finally {
        lock.unlock()
    }
}

// Another eg. of Higher-order function
fun<T,R> List<T>.map(transform: (T)->R):List<R> {
    val result = arrayListOf<R>()
    for(item in this){
        result.add(transform(item))
    }
    return result
}


fun main(args: Array<String>) {
    val list:List<Int> = listOf(1,2,3)
    val doubled = list.map { value->value *2 }
    println(doubled)


}


//Higher order functions Example
fun multiply():Int{
    return add(1,2) //-> Here it returns a function
}
fun add(a:Int,b:Int):Int{
    return a+b
}
