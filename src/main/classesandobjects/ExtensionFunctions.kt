package main.classesandobjects

fun main(args: Array<String>) {
    //  Extension functions
    fun Rabbit.snore(){
        println("I am Rabbit, I am snoring")
        walking =true
    }

    val rabbit = Rabbit()
    rabbit.sleep()

//    power of extension functions-->
//    we can declare a function for any class
//    and use it as if it were a function available within
//    that class
    rabbit.snore() //--> Valid


//    another example of Extension Function using collections from kotlin
  fun MutableList<Int>.swap(index1:Int, index2:Int){
      val tmp = this[index1]
      this[index2] = this[index1]
      this[index1] = tmp
  }

    val l = mutableListOf(1,2,3)
    l.swap(0,2)

}