package main.classesandobjects.delegation

class Rectangle(val width: Int, val height: Int) {
    fun area() = width * height
}

class Window(val bounds: Rectangle) {
    // Delegation
    fun area() = bounds.area()
}

fun main(args: Array<String>) {
    val rect = Rectangle(15,20) //--> created rectangle object here
    val win = Window(rect) // --> passed rectangle object ref to window object
    println(win.area()) // --> indirectly accessing Rectangle's getArea() using Window's getArea
}