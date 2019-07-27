package main.basics;

public abstract class Vamsi extends Human {

    @Override
    protected boolean ableToRideBike() {
        return true;
    }

    void printIfICanCook() {
        if(ableToCook()) {
            System.out.println("I can cook!");
        } else {
            System.out.println("I can't cook");
        }
    }
}
