package main.classesandobjects.nestedAndInnerClasses

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

//Nested class Eg.
class Outer{
       val size:Int = 1
        get() = field

        fun returnSize():Int{
            return size
        }
    class Nested{
        fun foo() = 2
    }
}

// Inner class Eg.
class Outer1{
       val size:Int = 1
        get() = field

        fun returnSize():Int{
            return size
        }
    inner class InnerClass{ // inner identifier used here
        fun foo() = size
    }
}

fun main(args: Array<String>) {
    val x = Outer.Nested().foo()
    println(x)
    val y = Outer().returnSize()

    val z = Outer1().InnerClass().foo()
}
