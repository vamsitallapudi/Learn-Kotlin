package main.classesandobjects

class Tiger : Animal(){

    init {
        hungry = false
    }

     override fun eat(){
         if(hungry) println("Tiger is eating rabbit")
         else println("Tiger just ate, come later")
    }

    override fun sleep() {
        println("Tiger is sleeping")
    }
}

