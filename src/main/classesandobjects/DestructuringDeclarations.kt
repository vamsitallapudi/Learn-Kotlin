package main.classesandobjects

data class Customer(var name:String, val age:Int)

fun main() {
    val customer = Customer("Vamsi", 27)

    val (name, age) = customer
    println("name is $name and age is $age")
}