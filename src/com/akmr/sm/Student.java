package com.akmr.sm;

public class Student {
    static int totalSubject = 5;
    static int maxMarks = 100;

    int rollNo;
    String name;
    String fathersName;
    String address;

    int physics;
    int chemistry;
    int maths;
    int english;
    int computerScience;

    public int getTotal(){
        return chemistry + physics + computerScience + maths + english;
    }

    public double getPercentage(){
        return (getTotal() * 100.0) / (totalSubject * maxMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", maths=" + maths +
                ", english=" + english +
                ", computerScience=" + computerScience +
                '}';
    }
}
