package main.basics;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.canEat());
        Human a = new Human();
        a.eyes = 2;
        a.nose = 0;
        a.teeth = 30;
        Human b = new Human();
        b.gender = "Male";
        b.teeth = 15;

        System.out.println(b.teeth);
        System.out.println(a.teeth);
    }
}
