package main.classesandobjects.functionsAndLambdas.functions

fun main(args: Array<String>) {


    area(1, 2, h = 3) //-> length is overrided to 1 (from default value of 2), it is allowed since named arguments are at last after positional arguments

    area(b = 2, h = 3) //-> length not declared, so takes default value

//    area(1,b=2,3) -> not allowed since all the positional arguments should be placed before the first named one

}

fun area(l:Int=2, b:Int, h:Int): Int {
    return l*b*h
}