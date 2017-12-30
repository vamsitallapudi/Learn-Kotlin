package main.JavaFiles.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    List<String> strs = new ArrayList<>();

//    java is invariant, i.e., List<String> is not a subtype of List<Object>
//    List<Object> objects = strs;  --> Not possible since java prohibits this

    public static void main(String[] args) {
        Object[] objToLng = new Long[1];
        objToLng[0] = "Hello";
        System.out.println(objToLng[0]);
    }

    void demo(Source<String> strs){
        Source<? extends Object> obj = strs;
    }





}
