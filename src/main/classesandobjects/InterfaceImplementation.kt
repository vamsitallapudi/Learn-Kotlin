package main.classesandobjects

fun main(args: Array<String>) {
    var fruits  = Fruits()
    fruits.apple()
}

class Fruits : InterfaceEg {
    override var a: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun apple() {
        mango()
        println("Apple is here!")
    }

    override fun mango() {
        println("MAANGOOOO!!!!")
        super.mango()
    }
}