package main.ControlFlow

// when is an alternative for switch in Java

fun main(args: Array<String>) {
    var x = 5
    hasPrefix(5)
    hasPrefix("vamsi")
    hasPrefix(true)

    performIfAlternative(x)

    useWhenDirectly(x)
}

fun useWhenDirectly(x:Int) {
//    here when used as normal switch condition and not as an expression
    when(x){
        in 1..20 -> println("X is in between the specified values")

    }
}

// else is must when 'when' is used as expression
fun hasPrefix(x:Any) = when (x) {
    is String -> print(x.startsWith("va"))
    is Int -> print(x.minus(1))
    is Boolean -> print(x.not())
    else -> false
}


fun performIfAlternative(x:Int) {

//    Here when is used as if else condition, so declaring a value is not required
    when{
        isOdd(x)-> println("Shut up!")
        else -> println("same 2 u")
    }
}

fun isOdd(a:Int) = a%2!=0
