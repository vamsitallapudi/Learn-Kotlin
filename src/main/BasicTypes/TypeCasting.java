/*
 * Copyright (c) 2017.
 * The Content is copyrighted to $Name
 */

package main.BasicTypes;

public class TypeCasting {

    public static void main(String[] args) {
        Integer a = 200;
        performOperationBasedOnDataType(a);

    }

    public static void performOperationBasedOnDataType(Object value){
        if(value instanceof String) {
            System.out.println(((String) value).length());
        } else if(!(value instanceof Integer)) {
            System.out.println(value);
        }
    }
}
