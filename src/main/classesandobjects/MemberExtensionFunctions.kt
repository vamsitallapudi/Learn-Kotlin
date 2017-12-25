package main.classesandobjects

open class D1{

}

class D2 :D1(){

}

open class C1{
    open fun D1.foo(){
        println("D1.foo in C1")
    }
    open fun D2.foo(){
        println("D2.foo in C1")
    }

    fun caller(d:D1){
        d.foo()
    }
}

class C2:C1(){
    override fun D1.foo(){
        println("D1.foo in C2")
    }
    override fun D2.foo(){
        println("D2.foo in C2")
    }
}

fun main(args: Array<String>) {
    C1().caller(D1()) // prints D1.foo in C1
    C2().caller(D1()) // prints D1.foo in C2
    C1().caller(D2()) // prints D2.foo in C1

}