package main.classesandobjects

import Other.Human
import Other.HumanBeing

/*data class must have atleast one parameter in primary constructor*/
data class User( var name:String, var age:Int) {

}

fun main(args: Array<String>) {

//instantiating normal class
    val human = Human("Samantha", 24, 5, 64)
//    human.age //--> cannot do since no default getters / setters for class

//    instantiating data class
    val humanbeing = HumanBeing("Taylor Swift", 34, 6, 54)
    humanbeing.age //--> accessible since getters and setters are generated for data class

    val user = User("Vamsi", 27)
    val jack = User("Jack", 36)
    /*copy function is used to create new object with just few data changes
    * (here it is just age*/
//    copy function is generated automatically when we create data class
    val youngerJack = jack.copy(age = 5)

}
