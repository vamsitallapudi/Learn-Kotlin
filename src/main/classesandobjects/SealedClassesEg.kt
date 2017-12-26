package main.classesandobjects

sealed class MySealedClass{

//    public constructor(age:Int, size:Int) --> Wrong, since sealed classes can only have private constructors
}

class SealedClassesEg{
//    Sealed classes cannot be instantiated since they are abstract
//    val sealedClass = MySealedClass() ---> wrong
}

sealed class Expr
//subclasses to the sealed classes should be declared
// only in the file in which sealed class is declared.
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2:Expr) : Expr()
object NotANumber : Expr()


fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
}



