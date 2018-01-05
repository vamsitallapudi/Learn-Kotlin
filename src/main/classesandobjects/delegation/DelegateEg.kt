package main.classesandobjects.delegation

interface Base{
    fun print()
}

class BaseImpl(private val x:Int) : Base{
    override fun print() {
        println(x)
    }
}

class Derived(b:Base) : Base by b //--> Here 'by' keyword denotes that b will be stored internally inside the class that extending it(i.e., Derived class here) and compiler will generate all the methods of Base that forward to b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print()
}