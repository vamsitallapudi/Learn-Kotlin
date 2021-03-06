package main.classesandobjects.functionsAndLambdas.functions

// Varargs Example

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

// second eg of vararg
fun add(vararg a: Int): Int {
    var sum = 0
    for (i in a)
        sum += i
    return sum
}

fun main(args: Array<String>) {
    val list = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(add(1,2,3,4,5,6))

//Spread Operator(i.e., *) can be used to pass an array directly as parameter of varargs instead of passing values one by one
    val a = arrayOf(4,5,6)
    println(asList(1,2, *a,10))

    val add = IntArray(10)
    add[0]  = 4
    add[1]  = 5
    println(add(1,2,3,*add,6)) //--> Spread operator usage Eg 2



}