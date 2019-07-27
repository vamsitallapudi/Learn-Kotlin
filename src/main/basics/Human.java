package main.basics;

class Human {
    String gender;
    int teeth;
    int eyes;
    int nose;

    int getHandCount() {
        return 2;
    }

    int getLegCount() {
        return 2;
    }

    protected boolean ableToRideBike() {
        return false;
    }

    protected boolean ableToCook() {
        return false;
    }

    void printIfICanCook() {
        if(ableToCook()) {
            System.out.println("I can cook!");
        } else {
            System.out.println("I can't cook");
        }
    }
//
//    abstract boolean hasSpectacles();
//
//    abstract boolean hasGoodHeight();


    public static boolean canEat() {
        return true;
    }
}
