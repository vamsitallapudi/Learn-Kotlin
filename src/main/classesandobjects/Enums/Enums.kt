package main.classesandobjects.Enums

enum class EnumEg{
    VAMSI, SUSHMA, HELLO, WORLD
}
enum class EnumEgWithValues(val a:String){
    NORTH("NORTH"), SOUTH("SOUTH"), WEST("WEST"), EAST("EAST")
}

fun main(args: Array<String>) {
    val x = EnumEg.values()
    for (y in x){
        when (y){
            EnumEg.VAMSI-> println("vamsi called")
            EnumEg.SUSHMA -> println("sushma called")
        }
    }
    val c = EnumEgWithValues.values()
    for (z in c){
        when (z){
            EnumEgWithValues.valueOf("NORTH")-> println("${EnumEgWithValues.NORTH} called")
            EnumEgWithValues.WEST -> println("${EnumEgWithValues.WEST} called")
        }
    }

}