/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */

package main.Loops

fun main(args: Array<String>) {
    var myArray = listOf(4,5,6,7,8)

//    for (i in myArray.indices){
//        println(i)
//    }

    for((a, b)in myArray.withIndex()){
        var c = "$a"
        println("the value at index $c is ${b+2}")

    }
}