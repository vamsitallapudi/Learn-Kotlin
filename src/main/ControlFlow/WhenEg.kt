/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */

package main.ControlFlow

import java.lang.Integer.parseInt

fun main(args: Array<String>) {


    var x = 3
    when (x){
        1 -> print("x==1")
        2 -> print("x==2")
        3 -> print("x==3")
        else -> print ("x is neither 1 or 2 or 3")
    }

//    check in range
    when (x) {
        in 1..10 -> print("X is in range")
        !in 10..20 -> print("X is not in range")
    }

//    when accepts expression too as condition as shown below
    val s = "3"
    when (s) {
        x.toString() -> print("s encodes x")
        else -> print("s does not encode x")
    }
}

// else ControlFlow is must for when used as expression
fun hasPrefix(x:Any) = when (x) {
    is String -> x.startsWith("va")
    else -> false
}
