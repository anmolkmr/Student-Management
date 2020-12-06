package com.akmr.sm;

public class Student {
    static int totalSubject = 5;
    static int maxMarks = 100;

    private int rollNo;
    private String name;
    private String fathersName;
    private String address;

    private int physics;
    private int chemistry;
    private int maths;
    private int english;
    private int computerScience;

    public int getTotal(){
        return chemistry + physics + computerScience + maths + english;
    }

    public double getPercentage(){
        return (getTotal() * 100.0) / (totalSubject * maxMarks);
    }

    public static int getTotalSubject() {
        return totalSubject;
    }

    public static void setTotalSubject(int totalSubject) {
        Student.totalSubject = totalSubject;
    }

    public static int getMaxMarks() {
        return maxMarks;
    }

    public static void setMaxMarks(int maxMarks) {
        Student.maxMarks = maxMarks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(int computerScience) {
        this.computerScience = computerScience;
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
