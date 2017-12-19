package main.classesandobjects

//      late initialization of top-level property
lateinit var hello : Vamsi

fun main(args: Array<String>) {
    var b = LateInitializedPropertiesAndVariables()
    b.initializeVariables()
    b.printName()

}

class LateInitializedPropertiesAndVariables{

//  declaring a variable that can be lately initialized
    lateinit var a: Sushma
    val b = 10

    public fun lateInitMethod(){
//      late initialization of Local variable
        lateinit var c: VamsiT
    }

    init {
    }

    fun printName(){
//        checks whether 'a' is initialized (as it was declared as lateinit)
        if(this::a.isInitialized){
            a.printName()
        }
    }

    fun initializeVariables() {
        a = Sushma("Sushma")
    }
}
