package com.akmr.sm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static Scanner in;
    private static StudentManager studentManager;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        studentManager = new StudentManager();
        in = new Scanner(System.in);

        while (true) {
            System.out.println("Input Request");
            String[] request = in.nextLine().split(" ");
            String[] subArray = Arrays.copyOfRange(request, 1, request.length);

            switch (request[0].toUpperCase()) {
                case "ADD":
                    Student newStudent = studentManager.makeStudent(subArray);
                    studentManager.addStudent(newStudent);
                    break;
                case "QUERY":
                    ArrayList<Student> result = query(subArray);
                    System.out.println(result);
                    break;
                case "QUIT":
                    System.exit(0);
                    break;
                case "PRINT":
                    studentManager.printStudents();
                    break;

            }
        }
    }

    private static ArrayList<Student> query(String[] inputSeparated) {
        switch (inputSeparated[0].toUpperCase()) {
            case "MINIMUM":
                return fetchMinimum(inputSeparated);
            case "MAXIMUM":
                return fetchMaximum(inputSeparated);
            case "FAIL":
                return fetchFail(inputSeparated);
            case "PASS":
                return fetchPass(inputSeparated);
            case "EQUAL":
                return fetchEqual(inputSeparated);
            case "OVERALL":
                return fetchOverall(inputSeparated);
        }
        return null;
    }

    private static ArrayList<Student> fetchMinimum(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return studentManager.getMinPhysics();
            case "CHEMISTRY":
                return studentManager.getMinChemistry();
            case "MATH":
                return studentManager.getMinMaths();
            case "ENGLISH":
                return studentManager.getMinEnglish();
            case "CS":
                return studentManager.getMinComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchMaximum(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return studentManager.getMaxPhysics();
            case "CHEMISTRY":
                return studentManager.getMaxChemistry();
            case "MATH":
                return studentManager.getMaxMaths();
            case "ENGLISH":
                return studentManager.getMaxEnglish();
            case "CS":
                return studentManager.getMaxComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchFail(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return studentManager.getFailPhysics();
            case "CHEMISTRY":
                return studentManager.getFailChemistry();
            case "MATH":
                return studentManager.getFailMaths();
            case "ENGLISH":
                return studentManager.getFailEnglish();
            case "CS":
                return studentManager.getFailComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchPass(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return studentManager.getPassPhysics();
            case "CHEMISTRY":
                return studentManager.getPassChemistry();
            case "MATH":
                return studentManager.getPassMaths();
            case "ENGLISH":
                return studentManager.getPassEnglish();
            case "CS":
                return studentManager.getPassComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchEqual(String[] inputSeparated) {
        String res = inputSeparated[1];
        String value = inputSeparated[2];
        switch (res.toUpperCase()) {
            case "NAME":
                return studentManager.getNameEqual(value);
            case "FNAME":
                return studentManager.getFathersNameEqual(value);
            case "ADDR":
                return studentManager.getAddressEqual(value);
            case "ROLL":
                return studentManager.getRollEqual(value);
            case "PHYSICS":
                return studentManager.getPhysicsEqual(value);
            case "CHEMISTRY":
                return studentManager.getChemistryEqual(value);
            case "MATH":
                return studentManager.getMathEqual(value);
            case "ENGLISH":
                return studentManager.getEnglishEqual(value);
            case "CS":
                return studentManager.getComputerScienceEqual(value);
        }
        return null;
    }

    private static ArrayList<Student> fetchOverall(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res.toUpperCase()) {
            case "MINIMUM":
                return studentManager.getOverallMinimum();
            case "MAXIMUM":
                return studentManager.getOverallMaximum();
            case "PASS":
                return studentManager.getOverallPass();
            case "FAIL":
                return studentManager.getOverallFail();
        }

        return null;
    }
}
