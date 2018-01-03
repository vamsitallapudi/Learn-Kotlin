package main.classesandobjects.objectExpressionsAndDeclarations

fun main(args: Array<String>) {
    val x = Thread(object : Runnable {
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })
}

open abstract class A(x:Int){
    abstract open val y :Int
}

interface B

val value:A = object : A(1),B {
    override val y: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}