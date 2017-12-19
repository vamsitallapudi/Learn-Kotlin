package main.classesandobjects

const val DEPRECATED_MSG:String="Hello"

class CompileTimeConstants{

    @Deprecated(DEPRECATED_MSG)fun foo(){
    }
}