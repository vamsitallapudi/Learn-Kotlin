package main.JavaFiles.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    List<String> strs = new ArrayList<>();

//    java is invariant, i.e., List<String> is not a subtype of List<Object>
//    List<Object> objects = strs;  --> Not possible since java prohibits this

    public static void main(String[] args) {
//        Object[] objToLng = new Long[1];
//        objToLng[0] = "Hello";
//        System.out.println(objToLng[0]);

        System.out.println("I am in old thread :(");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in new thread. Yay!");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in thread2. Yay!");
            }
        });
        thread.start();
        thread2.start();
    }

    void demo(Source<String> strs){
        Source<? extends Object> obj = strs;
    }






}
