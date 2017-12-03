package main.BasicTypes

fun main(args: Array<String>) {

    Person("vamsi",40)


}
class Person(name1:String,age1:Int){
    init {
        var name:String? = name1
        var age:Int? = age1
        println(name)
        println(age)
    }
}
