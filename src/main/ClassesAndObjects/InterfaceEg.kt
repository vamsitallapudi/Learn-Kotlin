package main.ClassesAndObjects

interface InterfaceEg{
//    variable without initialization / abstract keyword (possible in interface)
   var a:Int // by default, it is abstract

//    variable with accessors declaration
    val b:String
        get() = "Hello World"

    //  method without body
    fun apple()

    //  method with body
    fun mango(){
        println("Mango")
    }
}