package main.JavaFiles;


import com.sun.istack.internal.NotNull;

public class Student {

    @NotNull
    public String name;
    private int age;
    protected int rollNo;
    private String mobileNo;

    public Student(){
//        System.out.println("Hi");
    }


    public Student(String mobileNo){
        this.mobileNo = mobileNo;
        System.out.println(mobileNo);
    }


    public Student(@NotNull String name, String mobileNo, int age){
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public boolean getPassOrFail(int marks){
        if(marks > 35){
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    class Sushmi{
        Sushmi(){
            age = 45;
        }
    }
}
