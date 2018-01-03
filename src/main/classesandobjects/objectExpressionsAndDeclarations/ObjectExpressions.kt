package main.classesandobjects.objectExpressionsAndDeclarations

import main.JavaFiles.Student

fun main(args: Array<String>) {
    val x = Thread(object : Runnable {
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })
    val a = Student()
    if(a.getPassOrFail(15)){
        println("pass")
    } else {
        println("fail")
    }
    val b = Student()
    if(b.getPassOrFail(78)){
        println("pass")
    } else {
        println("fail")
    }
    MyStudent.passOrFail(95)
}

open abstract class A(x:Int){
    abstract open val y :Int
    object InnerObj{}
}

interface B

val value:A = object : A(1),B {
    override val y: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}

class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }
    // Public function, so the return type is Any
    fun publicFoo():Any = object {
        val x: String = "x"
    }
    fun bar() {
        val x1 = foo().x // Works
//        val x2 = publicFoo().x // ERROR: Unresolved reference 'x'
    }
}

// direct object creation (useful as singleton pattern
// since only one object is created totally)
object  MyStudent {
    fun passOrFail(x:Int){
        if(x>35){
            println("pass")
        } else {
            println("fail")
        }
    }
}

//object can extend superclass too
object  Vamsi:Student() {
    fun passOrFail(x:Int){
        if(x>35){
            println("pass")
        } else {
            println("fail")
        }
    }
//    object inside object is allowed
    object Krishna{
        fun playFlute(){}
    }
}

