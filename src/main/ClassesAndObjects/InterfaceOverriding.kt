package main.ClassesAndObjects

fun main(args: Array<String>) {
//    create an object for D

    val dObj = D()
    dObj.b()

    val eObj=E()
    eObj.a()
    eObj.b()

}

interface A{

    fun a() {
        println("Value from interface A")
    }

    fun b() {
        println("Vlue of B from Inteface B")
    }
}

interface B {
    fun a()
    fun b() {
        println("Interface 'b' value")
    }
}
interface C:B{
    override fun a(){
        println("body of 'a' from Interface C")
    }
}

//class implementing an interface
class D: C {
    override fun b() {
        super.b()
        println("body of 'b' from Class D")
    }
}

//Multiple Inheritance - Implementation from two interfaces
class E:A,B{
    override fun a() {
       super.a()
    }


    override fun b() {
    }

}