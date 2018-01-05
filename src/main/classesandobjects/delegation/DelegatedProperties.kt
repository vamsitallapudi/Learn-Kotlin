package main.classesandobjects.delegation

import kotlin.reflect.KProperty


class A {
    val a : Int by ClassForDelegation()
    var b : String by SecondClassForDelegation()
}


class ClassForDelegation{
    operator fun getValue(ref: Any, property: KProperty<*>): Int {
        return 56
    }
}

class SecondClassForDelegation{
    operator fun getValue(ref: Any, property: KProperty<*>): String {
        return "Sushma"
    }

    operator fun setValue(ref: A, property: KProperty<*>, s: String) {
        println("$s has been assigned to ${property.name} in $ref")

    }
}

fun main(args: Array<String>) {
    val value = A()
    value.b = "Krishna"




}