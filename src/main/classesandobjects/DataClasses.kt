package main.classesandobjects

/*data class must have atleast one parameter in primary constructor*/
data class User(override var name:String, override var age:Int):Student("Vamsi",27)

fun main(args: Array<String>) {
    val user = User("Vamsi", 27)

}