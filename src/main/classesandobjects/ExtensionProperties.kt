package main.classesandobjects

val <T> List<T>.lastIndex: Int
    get() = size - 1
val  Animal.lastName:String
        get() = "Horse"
val Student.lastName:String
    get() = "Tallapudi"
fun main(args: Array<String>) {
    val animal = Animal()
//    accessing Extension Variable
    println(animal.lastName)


    val student  = Student("Vamsi")
    // Another Example of accessing Extension Variable
    println(student.lastName)
}