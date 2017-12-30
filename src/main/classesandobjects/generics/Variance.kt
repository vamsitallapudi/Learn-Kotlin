package main.classesandobjects.generics


//Declaration site variance -- here out identifier is used so that compiler doesn't throw error
// while assigning str to obj of type any

/*
* PECS - Producer->Extends, Consumer-> Super
*
* Here Producer -> Covariant
* Consumer -> Contravariant
*
* In kotlin,
*           Covariant is declared by 'out' identifier
*           Contravariant is declared by 'in' identifier
*
* */

// Eg of covariant type, that is producers of Type T
abstract class Source<out T> { //---> 'out' is used
    abstract fun nextT():T
}

fun demo(str: Source<String>){
    val obj: Source<Any> = str  // This is OK, since T is an out-parameter
}

// Eg of contravariant type, that are consumers of Type T
abstract class Comparable<in T> {
    abstract fun compareTo(other:T) : Int
}

fun demo(x:Comparable<Number>){
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
// Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
}