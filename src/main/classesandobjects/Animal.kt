package main.classesandobjects

open class Animal {

    private val weight = 100
    internal val height = 4
    protected open var hungry:Boolean = false
    var walking:Boolean= true



    open fun eat(){
        println("Animal is eating")
    }
    open fun sleep(){
        println("Animal is sleeping")
    }

}