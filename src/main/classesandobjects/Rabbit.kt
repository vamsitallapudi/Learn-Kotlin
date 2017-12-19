package main.classesandobjects

class Rabbit : Animal(){

     override var hungry = false

    init {
        hungry = true
    }

    override fun eat() {
        if(hungry){
            println("Rabbit is eating grass")
        }
    }

    override fun sleep() {
        println("Rabbit is taking a nap")
    }

    private class blackRabbit{

        private val hel = 3
        init {
//            internal classes cannot access outer class's private members
//            hungry ---> compiler throws error!
        }

        private fun a() {

        }
    }
}