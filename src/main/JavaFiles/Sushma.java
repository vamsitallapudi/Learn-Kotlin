package main.JavaFiles;

public class Sushma extends Student{

    public Sushma(String mobileNo) {
        super(mobileNo);
    }

    @Override
    public boolean getPassOrFail(int marks) {
        int length = 30;

        if(marks>15){
            return true;
        } else {
            return false;
        }
    }
}
