package main.classesandobjects


fun main(args: Array<String>) {
//    val vamsikrishna = Student("vamsi", "8686670474",26)
//    val sushma = Student("sushma",22)
    val vamsi = Vamsi("vamsi")
    vamsi.printName()
}

//class with primary constructor
class DemoClass constructor(name: String)//curly braces can be omitted if there is no body

/*constructor keyword can be omitted
in case of no annotations or visibility modifiers
for primary constructor
 */


// primary constructor's arguments can be passed after class name
open class Student(open var name: String) {

    //primary constructors parameters are visible to the properties(fields) too
//    var nameToUppercase = name.toUpperCase()
    internal open var age = 10

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

open class Sushma : Student {
    open var height=5
    constructor(name:String):super(name)
    constructor(name:String, age:Int):super(name, age)
    constructor(name:String, mobileNo: String,age:Int):super(name, mobileNo,age)

    //A member marked override is itself open
    override fun printName(){
        println("Hello world, i am $name")
    }

    fun getMyWeight():Int{
        return height
    }
}



class Vamsi(var myName: String) : Sushma(myName) {
    override var height = 6
    init {
        this.name = myName
    }

    override fun printName() {
        println("This is name in $myName's style")
        super.getMyWeight()
    }

}

