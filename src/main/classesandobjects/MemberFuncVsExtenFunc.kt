package main.classesandobjects

// Member Function vs Extension Function
class MemberFuncVsExtenFunc {
    fun foo() {
        println("Member Function wins!") //--> Member Function wins over Extension Function
    }
}

fun main(args: Array<String>) {
    fun MemberFuncVsExtenFunc.foo(){
        println("Extension function wins!")//--> Never prints as it is shadowed by member function
    }

    var memFuncVsExtFunc = MemberFuncVsExtenFunc()
    memFuncVsExtFunc.foo()
}
