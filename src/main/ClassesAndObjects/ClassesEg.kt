package main.ClassesAndObjects


fun main(args: Array<String>) {
    val vamsi = Student("vamsi", "8686670474",26)
    val sushma = Student("sushma",22)
}

//class with primary constructor
class DemoClass constructor(name: String)//curly braces can be omitted if there is no body

/*constructor keyword can be omitted
in case of no annotations or visibility modifiers
for primary constructor
 */


// primary constructor's arguments can be passed after class name
open class Student(var name: String) {

    //primary constructors parameters are visible to the properties(fields) too
    var nameToUppercase = name.toUpperCase()
    var age = 10

    open fun printName(){
        println(name.toUpperCase())
    }

    //    this is the body of primary constructor
    init {
        println("Hey there, my name is $name")
    }

    //    secondary constructor, Here 'this' keyword is used to
    // delegate(refer to) primary constructor
    constructor(name: String, age: Int) : this(name){
        println(name)
        println(age)
    }
    constructor(name:String, mobileNo:String, age:Int) : this(name,age){
        println(name)
        println(mobileNo)
        println(age)
    }
}

open class Sushma : Student("sushma") {

    final override fun printName(){
        println("Hey there this is my extended class")
    }

}

