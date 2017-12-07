package main.ClassesAndObjects

fun main(args: Array<String>) {

    var v = VamsiT()
    v.height()
    v
}

open class Person {
    open fun height(){
        println("Hi Person!")
    }
    fun weight(){

    }
}

interface Man{
    fun height(){
        println("Hi Man!")
    }
    fun name(){
        println("Hey there")
    }
}

class VamsiT:Person(), Man {

    var a:Int = 0
        set(b:Int) {
            this.a=b
        }

    override fun height() {
        super<Person>.height()
    }
}