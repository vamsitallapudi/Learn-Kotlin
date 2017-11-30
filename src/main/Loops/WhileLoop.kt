/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */

package main.Loops

fun main(args: Array<String>) {
    val items = listOf("apple","banana","pineapple")
    var index = 0
    while (index< items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}