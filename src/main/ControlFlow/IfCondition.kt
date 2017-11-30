/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */

package main.ControlFlow

fun main(args: Array<String>) {
    var a = 9
    var b = 10
    var max:Int

//    'if' used as normal
    if(a>b){
        max = a
    } else {
        max = b
    }
    print(max)

    val max1 = if(a>b) a else b

//    'if' used as expression
    val max2 = if (a>b) print(a) else print(b)


}