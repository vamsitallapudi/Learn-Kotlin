/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */
package main.BasicTypes

fun main(args : Array<String>) {
    val b:Byte = 5
//    No Implicit Conversion
//    val a:Int = b ---> Type Mismatch!

//    We need to convert it explicitly
    val a:Int = b.toInt()
    println(a)

//    Arithmetic Operations does the conversion for us!
    val c:Int = a + b
    println(c)



}