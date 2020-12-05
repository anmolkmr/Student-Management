package com.akmr.sm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    private static Scanner in;
    private static ArrayList<Student> students;
    private static final int SUBJECT_PASSING_THRESHOLD = 33;
    private static final double PASSING_THRESHOLD = 33.33;

    public static void start() {
        in = new Scanner(System.in);

        students = new ArrayList<>();

        while (true) {
            System.out.println("Input Query");
            String op = in.next();
            switch (op.toUpperCase()) {
                case "ADD":
                    addStudent();
                    break;
                case "QUERY":
                    query();
                    break;
                case "QUIT":
                    System.exit(0);
                    break;
                case "PRINT":
                    printStudents();
                    break;

            }
        }
    }

    private static void addStudent() {
        String input = in.nextLine().trim();
        String[] inputSeparated = input.split(" ");
        System.out.println(Arrays.toString(inputSeparated));

        Student student = new Student();
        student.name = inputSeparated[0];
        student.fathersName = inputSeparated[1];
        student.address = inputSeparated[2];
        student.rollNo = Integer.parseInt(inputSeparated[3]);
        student.physics = Integer.parseInt(inputSeparated[4]);
        student.chemistry = Integer.parseInt(inputSeparated[5]);
        student.maths = Integer.parseInt(inputSeparated[6]);
        student.english = Integer.parseInt(inputSeparated[7]);
        student.computerScience = Integer.parseInt(inputSeparated[8]);

        students.add(student);
    }

    private static void printStudents() {
        for (Student student : students)
            System.out.println(student);
    }

    private static void query() {
        String input = in.nextLine().trim();
        String[] inputSeparated = input.split(" ");
        switch (inputSeparated[0].toUpperCase()) {
            case "MINIMUM":
                System.out.println(fetchMinimum(inputSeparated));
                break;
            case "MAXIMUM":
                System.out.println(fetchMaximum(inputSeparated));
                break;
            case "FAIL":
                System.out.println(fetchFail(inputSeparated));
                break;
            case "PASS":
                System.out.println(fetchPass(inputSeparated));
                break;
            case "EQUAL":
                System.out.println(fetchEqual(inputSeparated));
                break;
            case "OVERALL":
                System.out.println(fetchOverall(inputSeparated));
                break;
        }

    }

    private static ArrayList<Student> fetchMinimum(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return getMinPhysics();
            case "CHEMISTRY":
                return getMinChemistry();
            case "MATH":
                return getMinMaths();
            case "ENGLISH":
                return getMinEnglish();
            case "CS":
                return getMinComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> getMaxPhysics() {
        ArrayList<Student> maximumPhysics = new ArrayList<>();
        int maxPhysics = -1;

        for (Student st : students) {

            if (st.physics > maxPhysics) {
                maximumPhysics.clear();
                maximumPhysics.add(st);
                maxPhysics = st.physics;
            } else if (st.physics == maxPhysics) {
                maximumPhysics.add(st);
            }
        }

        return maximumPhysics;
    }

    private static ArrayList<Student> getMaxChemistry() {
        ArrayList<Student> maximumChemistry = new ArrayList<>();
        int maxChemistry = -1;

        for (Student st : students) {

            if (st.chemistry > maxChemistry) {
                maximumChemistry.clear();
                maximumChemistry.add(st);
                maxChemistry = st.chemistry;
            } else if (st.chemistry == maxChemistry) {
                maximumChemistry.add(st);
            }
        }

        return maximumChemistry;
    }

    private static ArrayList<Student> getMaxMaths() {
        ArrayList<Student> maximumMath = new ArrayList<>();
        int maxMath = -1;

        for (Student st : students) {

            if (st.maths > maxMath) {
                maximumMath.clear();
                maximumMath.add(st);
                maxMath = st.maths;
            } else if (st.maths == maxMath) {
                maximumMath.add(st);
            }
        }

        return maximumMath;
    }

    private static ArrayList<Student> getMaxEnglish() {
        ArrayList<Student> maximumEnglish = new ArrayList<>();
        int maxEnglish = -1;

        for (Student st : students) {

            if (st.english > maxEnglish) {
                maximumEnglish.clear();
                maximumEnglish.add(st);
                maxEnglish = st.english;
            } else if (st.english == maxEnglish) {
                maximumEnglish.add(st);
            }
        }

        return maximumEnglish;
    }

    private static ArrayList<Student> getMaxComputerScience() {
        ArrayList<Student> maximumComputerScience = new ArrayList<>();
        int maxComputerScience = -1;

        for (Student st : students) {

            if (st.computerScience > maxComputerScience) {
                maximumComputerScience.clear();
                maximumComputerScience.add(st);
                maxComputerScience = st.computerScience;
            } else if (st.computerScience == maxComputerScience) {
                maximumComputerScience.add(st);
            }
        }

        return maximumComputerScience;
    }

    private static ArrayList<Student> fetchMaximum(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return getMaxPhysics();
            case "CHEMISTRY":
                return getMaxChemistry();
            case "MATH":
                return getMaxMaths();
            case "ENGLISH":
                return getMaxEnglish();
            case "CS":
                return getMaxComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchFail(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return getFailPhysics();
            case "CHEMISTRY":
                return getFailChemistry();
            case "MATH":
                return getFailMaths();
            case "ENGLISH":
                return getFailEnglish();
            case "CS":
                return getFailComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchPass(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res) {
            case "PHYSICS":
                return getPassPhysics();
            case "CHEMISTRY":
                return getPassChemistry();
            case "MATH":
                return getPassMaths();
            case "ENGLISH":
                return getPassEnglish();
            case "CS":
                return getPassComputerScience();
        }
        return null;
    }

    private static ArrayList<Student> fetchEqual(String[] inputSeparated) {
        String res = inputSeparated[1];
        String value = inputSeparated[2];
        switch (res.toUpperCase()) {
            case "NAME":
                return getNameEqual(value);
            case "FNAME":
                return getFathersNameEqual(value);
            case "ADDR":
                return getAddressEqual(value);
            case "ROLL":
                return getRollEqual(value);
            case "PHYSICS":
                return getPhysicsEqual(value);
            case "CHEMISTRY":
                return getChemistryEqual(value);
            case "MATH":
                return getMathEqual(value);
            case "ENGLISH":
                return getEnglishEqual(value);
            case "CS":
                return getComputerScienceEqual(value);
        }
        return null;
    }

    private static ArrayList<Student> fetchOverall(String[] inputSeparated) {
        String res = inputSeparated[1];
        switch (res.toUpperCase()) {
            case "MINIMUM":
                return getOverallMinimum();
            case "MAXIMUM":
                return getOverallMaximum();
            case "PASS":
                return getOverallPass();
            case "FAIL":
                return getOverallFail();
        }

        return null;
    }

    private static ArrayList<Student> getOverallPass() {
        ArrayList<Student> passedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPercentage() >= PASSING_THRESHOLD)
                passedStudents.add(st);
        }
        return passedStudents;
    }

    private static ArrayList<Student> getOverallFail() {
        ArrayList<Student> failedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPercentage() < PASSING_THRESHOLD)
                failedStudents.add(st);
        }
        return failedStudents;
    }

    private static ArrayList<Student> getOverallMaximum() {
        ArrayList<Student> maximumScoredStudents = new ArrayList<>();
        int totalMaximum = -1;

        for (Student st : students) {

            if (st.getTotal() > totalMaximum) {
                maximumScoredStudents.clear();
                maximumScoredStudents.add(st);
                totalMaximum = st.getTotal();
            } else if (st.getTotal() == totalMaximum) {
                maximumScoredStudents.add(st);
            }
        }

        return maximumScoredStudents;
    }

    private static ArrayList<Student> getOverallMinimum() {
        ArrayList<Student> minimumScoredStudents = new ArrayList<>();
        int totalMinimum = 501;

        for (Student st : students) {

            if (st.getTotal() < totalMinimum) {
                minimumScoredStudents.clear();
                minimumScoredStudents.add(st);
                totalMinimum = st.getTotal();
            } else if (st.getTotal() == totalMinimum) {
                minimumScoredStudents.add(st);
            }
        }

        return minimumScoredStudents;
    }

    private static ArrayList<Student> getNameEqual(String value) {
        ArrayList<Student> nameEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.name.equals(value))
                nameEquals.add(st);
        }

        return nameEquals;
    }

    private static ArrayList<Student> getFathersNameEqual(String value) {
        ArrayList<Student> fathersNameEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.fathersName.equals(value))
                fathersNameEquals.add(st);
        }

        return fathersNameEquals;
    }

    private static ArrayList<Student> getAddressEqual(String value) {
        ArrayList<Student> AddressEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.address.equals(value))
                AddressEquals.add(st);
        }

        return AddressEquals;
    }

    private static ArrayList<Student> getRollEqual(String value) {
        ArrayList<Student> RollEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.rollNo == Integer.parseInt(value))
                RollEquals.add(st);
        }

        return RollEquals;
    }

    private static ArrayList<Student> getPhysicsEqual(String value) {
        ArrayList<Student> PhysicsEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.physics == Integer.parseInt(value))
                PhysicsEquals.add(st);
        }

        return PhysicsEquals;
    }

    private static ArrayList<Student> getChemistryEqual(String value) {
        ArrayList<Student> ChemistryEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.chemistry == Integer.parseInt(value))
                ChemistryEquals.add(st);
        }

        return ChemistryEquals;
    }

    private static ArrayList<Student> getMathEqual(String value) {
        ArrayList<Student> MathsEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.maths == Integer.parseInt(value))
                MathsEquals.add(st);
        }

        return MathsEquals;
    }

    private static ArrayList<Student> getEnglishEqual(String value) {
        ArrayList<Student> englishEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.english == Integer.parseInt(value))
                englishEquals.add(st);
        }

        return englishEquals;
    }

    private static ArrayList<Student> getComputerScienceEqual(String value) {
        ArrayList<Student> computerScienceEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.computerScience == Integer.parseInt(value))
                computerScienceEquals.add(st);
        }

        return computerScienceEquals;
    }

    private static ArrayList<Student> getPassPhysics() {
        ArrayList<Student> physicsPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.physics >= SUBJECT_PASSING_THRESHOLD)
                physicsPassedStudents.add(st);
        }

        return physicsPassedStudents;
    }

    private static ArrayList<Student> getPassChemistry() {
        ArrayList<Student> chemistryPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.chemistry >= SUBJECT_PASSING_THRESHOLD)
                chemistryPassedStudents.add(st);
        }

        return chemistryPassedStudents;
    }

    private static ArrayList<Student> getPassMaths() {
        ArrayList<Student> mathsPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.maths >= SUBJECT_PASSING_THRESHOLD)
                mathsPassedStudents.add(st);
        }

        return mathsPassedStudents;
    }

    private static ArrayList<Student> getPassEnglish() {
        ArrayList<Student> englishPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.english >= SUBJECT_PASSING_THRESHOLD)
                englishPassedStudents.add(st);
        }

        return englishPassedStudents;
    }

    private static ArrayList<Student> getPassComputerScience() {
        ArrayList<Student> ComputerSciencePassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.computerScience >= SUBJECT_PASSING_THRESHOLD)
                ComputerSciencePassedStudents.add(st);
        }

        return ComputerSciencePassedStudents;
    }

    private static ArrayList<Student> getFailPhysics() {
        ArrayList<Student> physicsFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.physics < SUBJECT_PASSING_THRESHOLD)
                physicsFailedStudents.add(st);
        }

        return physicsFailedStudents;
    }

    private static ArrayList<Student> getFailChemistry() {
        ArrayList<Student> chemistryFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.chemistry < SUBJECT_PASSING_THRESHOLD)
                chemistryFailedStudents.add(st);
        }

        return chemistryFailedStudents;
    }

    private static ArrayList<Student> getFailMaths() {
        ArrayList<Student> mathsFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.maths < SUBJECT_PASSING_THRESHOLD)
                mathsFailedStudents.add(st);
        }

        return mathsFailedStudents;
    }

    private static ArrayList<Student> getFailEnglish() {
        ArrayList<Student> englishFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.english < SUBJECT_PASSING_THRESHOLD)
                englishFailedStudents.add(st);
        }

        return englishFailedStudents;
    }

    private static ArrayList<Student> getFailComputerScience() {
        ArrayList<Student> ComputerScienceFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.computerScience < SUBJECT_PASSING_THRESHOLD)
                ComputerScienceFailedStudents.add(st);
        }

        return ComputerScienceFailedStudents;
    }

    private static ArrayList<Student> getMinPhysics() {
        ArrayList<Student> minimumPhysics = new ArrayList<>();
        int minPhysics = 101;

        for (Student st : students) {

            if (st.physics < minPhysics) {
                minimumPhysics.clear();
                minimumPhysics.add(st);
                minPhysics = st.physics;
            } else if (st.physics == minPhysics) {
                minimumPhysics.add(st);
            }
        }

        return minimumPhysics;
    }

    private static ArrayList<Student> getMinChemistry() {
        ArrayList<Student> minimumChemistry = new ArrayList<>();
        int minChemistry = 101;

        for (Student st : students) {

            if (st.chemistry < minChemistry) {
                minimumChemistry.clear();
                minimumChemistry.add(st);
                minChemistry = st.chemistry;
            } else if (st.chemistry == minChemistry) {
                minimumChemistry.add(st);
            }
        }

        return minimumChemistry;
    }

    private static ArrayList<Student> getMinMaths() {
        ArrayList<Student> minimumMath = new ArrayList<>();
        int minMath = 101;

        for (Student st : students) {

            if (st.maths < minMath) {
                minimumMath.clear();
                minimumMath.add(st);
                minMath = st.maths;
            } else if (st.maths == minMath) {
                minimumMath.add(st);
            }
        }

        return minimumMath;
    }

    private static ArrayList<Student> getMinEnglish() {
        ArrayList<Student> minimumEnglish = new ArrayList<>();
        int minEnglish = 101;

        for (Student st : students) {

            if (st.english < minEnglish) {
                minimumEnglish.clear();
                minimumEnglish.add(st);
                minEnglish = st.english;
            } else if (st.english == minEnglish) {
                minimumEnglish.add(st);
            }
        }

        return minimumEnglish;
    }

    private static ArrayList<Student> getMinComputerScience() {
        ArrayList<Student> minimumComputerScience = new ArrayList<>();
        int minComputerScience = 101;

        for (Student st : students) {

            if (st.computerScience < minComputerScience) {
                minimumComputerScience.clear();
                minimumComputerScience.add(st);
                minComputerScience = st.computerScience;
            } else if (st.computerScience == minComputerScience) {
                minimumComputerScience.add(st);
            }
        }

        return minimumComputerScience;
    }
}