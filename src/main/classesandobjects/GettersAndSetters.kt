package main.classesandobjects

class GettersAndSetters {

    /*
* var propertyName:propertyType = propertyInitializer getter setter
* */
    var size:Int = 4

//    property with initializer
    var length = 10

//  property with getter and setter declared using var keyword
    var breadth
        get() = this.size
        set(value) {
            this.breadth = value
        }
//  property with only getter is enough using val keyword

//
    var setterWithAccessModifier = 10
        get(){
            return 10
        }
        private set(value){
            field = value
        }
}