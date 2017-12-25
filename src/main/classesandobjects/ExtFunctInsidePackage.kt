package main.classesandobjects
/*This class is to demonstrate the usage of extension functions inside
* the package that they were declared.*/

class ExtFunctInsidePackage{
    fun useRabbitSnore(){
//        calling snore extension property declared inside ExtensionFunctions class
        Rabbit().snore()
    }
}

fun main(args: Array<String>) {
    val exportExtensions = ExtFunctInsidePackage()
    exportExtensions.useRabbitSnore()
}