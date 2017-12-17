package main.ClassesAndObjects

const val DEPRECATED_MSG:String="Hello"

class CompileTimeConstants{

    @Deprecated(DEPRECATED_MSG)fun foo(){
    }
}