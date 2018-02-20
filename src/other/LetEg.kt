package other

class LetEg{
    fun test(){
        val name = "Vamsi"
        val initial = "Tallapudi"

        val result = initial.let {
            this.samplePrint() //-> accessing the class using this and calling its properties
            println(it)// -> calling the
            53
        }
    }
    fun samplePrint(){
        println("This is a sample print")
    }

}

fun main(args: Array<String>) {
    var letEg: LetEg = LetEg()
    letEg!!.test()

}