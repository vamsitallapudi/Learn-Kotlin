package main.classesandobjects

/*This is the best place to declare Extension Functions / Properties
* i.e., just below package declaration*/
fun Rabbit.snore() {
    println("I am Rabbit, I am snoring")
    walking = true
}

fun main(args: Array<String>) {
    //  Extension functions
    val rabbit = Rabbit()
    rabbit.sleep()

//    power of extension functions-->
//    we can declare a function for any class
//    and use it as if it were a function available within
//    that class
    rabbit.snore() //--> Valid


    //    another example of Extension Function using collections from kotlin
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index2] = this[index1]
        this[index1] = tmp
    }

    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2)

//    Extension functions are not resolved statically

    open class C
    class D : C()

    fun C.foo() {
        println("C")
    }

    fun D.foo() {
        println("D")
    }

    fun printFoo(obj:C) {
        obj.foo()
    }
//prints c because extension function depends only on declared type, i.e.,
//    here it is object of type C
    printFoo(D())
}


