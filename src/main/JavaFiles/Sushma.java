package main.JavaFiles;

public class Sushma extends Student{

    public Sushma(String mobileNo) {
        super(mobileNo);
    }

    @Override
    public boolean getPassOrFail(int marks) {
        if(marks>15){
            return true;
        } else {
            return false;
        }
    }
}
