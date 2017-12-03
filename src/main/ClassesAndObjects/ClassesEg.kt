package main.ClassesAndObjects


fun main(args: Array<String>) {
    MyDemoClass("vamsi", 26)
}

//class with primary constructor
class DemoClass constructor(name: String)//curly braces can be omitted if there is no body

/*constructor keyword can be omitted
in case of no annotations or visibility modifiers
for primary constructor
 */


// primary constructor's arguments can be passed after class name
class MyDemoClass(val name: String) {

    //primary constructors parameters are visible to the fields/properties too
    var nameToUppercase = name.toUpperCase()
    var age = 10

    //    this is the body of primary constructor
    init {
        println("Hey there, my name is $name")
    }

    //    secondary constructor
    constructor(name: String, age: Int) : this(name){
        println(name)
        println(age)
    }
}
