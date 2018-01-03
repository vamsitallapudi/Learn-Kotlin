package main.JavaFiles.delegate;

public class DelegateEg {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Window window = new Window(rectangle);
        System.out.println(window.area());
    }


}
class Rectangle {

    int len;
    int brth;

    Rectangle(int length, int breadth){
        len = length;
        brth = breadth;
    }

    protected int area(){
        return len * brth;
    }
}

class Window{
    Rectangle rectangle;

    Window(Rectangle rect){
        rectangle = rect;
    }

    protected int area(){
        return rectangle.area();
    }
}
