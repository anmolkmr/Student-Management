package com.akmr.sm;

import java.util.ArrayList;

public class StudentManager {
    private static final int SUBJECT_PASSING_THRESHOLD = 33;
    private static final double PASSING_THRESHOLD = 33.33;

    private static ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public Student makeStudent(String[] inputValues) {
        Student student = new Student();

        student.setName(inputValues[0]);
        student.setFathersName(inputValues[1]);
        student.setAddress(inputValues[2]);
        student.setRollNo(Integer.parseInt(inputValues[3]));
        student.setPhysics(Integer.parseInt(inputValues[4]));
        student.setChemistry(Integer.parseInt(inputValues[5]));
        student.setMaths(Integer.parseInt(inputValues[6]));
        student.setEnglish(Integer.parseInt(inputValues[7]));
        student.setComputerScience(Integer.parseInt(inputValues[8]));

        return student;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students)
            System.out.println(student);
    }

    public ArrayList<Student> getMaxPhysics() {
        ArrayList<Student> maximumPhysics = new ArrayList<>();
        int maxPhysics = -1;

        for (Student st : students) {

            if (st.getPhysics() > maxPhysics) {
                maximumPhysics.clear();
                maximumPhysics.add(st);
                maxPhysics = st.getPhysics();
            } else if (st.getPhysics() == maxPhysics) {
                maximumPhysics.add(st);
            }
        }

        return maximumPhysics;
    }

    public ArrayList<Student> getMaxChemistry() {
        ArrayList<Student> maximumChemistry = new ArrayList<>();
        int maxChemistry = -1;

        for (Student st : students) {

            if (st.getChemistry() > maxChemistry) {
                maximumChemistry.clear();
                maximumChemistry.add(st);
                maxChemistry = st.getChemistry();
            } else if (st.getChemistry() == maxChemistry) {
                maximumChemistry.add(st);
            }
        }

        return maximumChemistry;
    }

    public ArrayList<Student> getMaxMaths() {
        ArrayList<Student> maximumMath = new ArrayList<>();
        int maxMath = -1;

        for (Student st : students) {

            if (st.getMaths() > maxMath) {
                maximumMath.clear();
                maximumMath.add(st);
                maxMath = st.getMaths();
            } else if (st.getMaths() == maxMath) {
                maximumMath.add(st);
            }
        }

        return maximumMath;
    }

    public ArrayList<Student> getMaxEnglish() {
        ArrayList<Student> maximumEnglish = new ArrayList<>();
        int maxEnglish = -1;

        for (Student st : students) {

            if (st.getEnglish() > maxEnglish) {
                maximumEnglish.clear();
                maximumEnglish.add(st);
                maxEnglish = st.getEnglish();
            } else if (st.getEnglish() == maxEnglish) {
                maximumEnglish.add(st);
            }
        }

        return maximumEnglish;
    }

    public ArrayList<Student> getMaxComputerScience() {
        ArrayList<Student> maximumComputerScience = new ArrayList<>();
        int maxComputerScience = -1;

        for (Student st : students) {

            if (st.getComputerScience() > maxComputerScience) {
                maximumComputerScience.clear();
                maximumComputerScience.add(st);
                maxComputerScience = st.getComputerScience();
            } else if (st.getComputerScience() == maxComputerScience) {
                maximumComputerScience.add(st);
            }
        }

        return maximumComputerScience;
    }

    public ArrayList<Student> getOverallPass() {
        ArrayList<Student> passedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPercentage() >= PASSING_THRESHOLD)
                passedStudents.add(st);
        }
        return passedStudents;
    }

    public ArrayList<Student> getOverallFail() {
        ArrayList<Student> failedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPercentage() < PASSING_THRESHOLD)
                failedStudents.add(st);
        }
        return failedStudents;
    }

    public ArrayList<Student> getOverallMaximum() {
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

    public ArrayList<Student> getOverallMinimum() {
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

    public ArrayList<Student> getNameEqual(String value) {
        ArrayList<Student> nameEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getName().equals(value))
                nameEquals.add(st);
        }

        return nameEquals;
    }

    public ArrayList<Student> getFathersNameEqual(String value) {
        ArrayList<Student> fathersNameEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getFathersName().equals(value))
                fathersNameEquals.add(st);
        }

        return fathersNameEquals;
    }

    public ArrayList<Student> getAddressEqual(String value) {
        ArrayList<Student> AddressEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getAddress().equals(value))
                AddressEquals.add(st);
        }

        return AddressEquals;
    }

    public ArrayList<Student> getRollEqual(String value) {
        ArrayList<Student> RollEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getRollNo() == Integer.parseInt(value))
                RollEquals.add(st);
        }

        return RollEquals;
    }

    public ArrayList<Student> getPhysicsEqual(String value) {
        ArrayList<Student> PhysicsEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getPhysics() == Integer.parseInt(value))
                PhysicsEquals.add(st);
        }

        return PhysicsEquals;
    }

    public ArrayList<Student> getChemistryEqual(String value) {
        ArrayList<Student> ChemistryEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getChemistry() == Integer.parseInt(value))
                ChemistryEquals.add(st);
        }

        return ChemistryEquals;
    }

    public ArrayList<Student> getMathEqual(String value) {
        ArrayList<Student> MathsEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getMaths() == Integer.parseInt(value))
                MathsEquals.add(st);
        }

        return MathsEquals;
    }

    public ArrayList<Student> getEnglishEqual(String value) {
        ArrayList<Student> englishEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getEnglish() == Integer.parseInt(value))
                englishEquals.add(st);
        }

        return englishEquals;
    }

    public ArrayList<Student> getComputerScienceEqual(String value) {
        ArrayList<Student> computerScienceEquals = new ArrayList<>();

        for (Student st : students) {
            if (st.getComputerScience() == Integer.parseInt(value))
                computerScienceEquals.add(st);
        }

        return computerScienceEquals;
    }

    public ArrayList<Student> getPassPhysics() {
        ArrayList<Student> physicsPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPhysics() >= SUBJECT_PASSING_THRESHOLD)
                physicsPassedStudents.add(st);
        }

        return physicsPassedStudents;
    }

    public ArrayList<Student> getPassChemistry() {
        ArrayList<Student> chemistryPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getChemistry() >= SUBJECT_PASSING_THRESHOLD)
                chemistryPassedStudents.add(st);
        }

        return chemistryPassedStudents;
    }

    public ArrayList<Student> getPassMaths() {
        ArrayList<Student> mathsPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getMaths() >= SUBJECT_PASSING_THRESHOLD)
                mathsPassedStudents.add(st);
        }

        return mathsPassedStudents;
    }

    public ArrayList<Student> getPassEnglish() {
        ArrayList<Student> englishPassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getEnglish() >= SUBJECT_PASSING_THRESHOLD)
                englishPassedStudents.add(st);
        }

        return englishPassedStudents;
    }

    public ArrayList<Student> getPassComputerScience() {
        ArrayList<Student> ComputerSciencePassedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getComputerScience() >= SUBJECT_PASSING_THRESHOLD)
                ComputerSciencePassedStudents.add(st);
        }

        return ComputerSciencePassedStudents;
    }

    public ArrayList<Student> getFailPhysics() {
        ArrayList<Student> physicsFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getPhysics() < SUBJECT_PASSING_THRESHOLD)
                physicsFailedStudents.add(st);
        }

        return physicsFailedStudents;
    }

    public ArrayList<Student> getFailChemistry() {
        ArrayList<Student> chemistryFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getChemistry() < SUBJECT_PASSING_THRESHOLD)
                chemistryFailedStudents.add(st);
        }

        return chemistryFailedStudents;
    }

    public ArrayList<Student> getFailMaths() {
        ArrayList<Student> mathsFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getMaths() < SUBJECT_PASSING_THRESHOLD)
                mathsFailedStudents.add(st);
        }

        return mathsFailedStudents;
    }

    public ArrayList<Student> getFailEnglish() {
        ArrayList<Student> englishFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getEnglish() < SUBJECT_PASSING_THRESHOLD)
                englishFailedStudents.add(st);
        }

        return englishFailedStudents;
    }

    public ArrayList<Student> getFailComputerScience() {
        ArrayList<Student> ComputerScienceFailedStudents = new ArrayList<>();

        for (Student st : students) {
            if (st.getComputerScience() < SUBJECT_PASSING_THRESHOLD)
                ComputerScienceFailedStudents.add(st);
        }

        return ComputerScienceFailedStudents;
    }

    public ArrayList<Student> getMinPhysics() {
        ArrayList<Student> minimumPhysics = new ArrayList<>();
        int minPhysics = 101;

        for (Student st : students) {

            if (st.getPhysics() < minPhysics) {
                minimumPhysics.clear();
                minimumPhysics.add(st);
                minPhysics = st.getPhysics();
            } else if (st.getPhysics() == minPhysics) {
                minimumPhysics.add(st);
            }
        }

        return minimumPhysics;
    }

    public ArrayList<Student> getMinChemistry() {
        ArrayList<Student> minimumChemistry = new ArrayList<>();
        int minChemistry = 101;

        for (Student st : students) {

            if (st.getChemistry() < minChemistry) {
                minimumChemistry.clear();
                minimumChemistry.add(st);
                minChemistry = st.getChemistry();
            } else if (st.getChemistry() == minChemistry) {
                minimumChemistry.add(st);
            }
        }

        return minimumChemistry;
    }

    public ArrayList<Student> getMinMaths() {
        ArrayList<Student> minimumMath = new ArrayList<>();
        int minMath = 101;

        for (Student st : students) {

            if (st.getMaths() < minMath) {
                minimumMath.clear();
                minimumMath.add(st);
                minMath = st.getMaths();
            } else if (st.getMaths() == minMath) {
                minimumMath.add(st);
            }
        }

        return minimumMath;
    }

    public ArrayList<Student> getMinEnglish() {
        ArrayList<Student> minimumEnglish = new ArrayList<>();
        int minEnglish = 101;

        for (Student st : students) {

            if (st.getEnglish() < minEnglish) {
                minimumEnglish.clear();
                minimumEnglish.add(st);
                minEnglish = st.getEnglish();
            } else if (st.getEnglish() == minEnglish) {
                minimumEnglish.add(st);
            }
        }

        return minimumEnglish;
    }

    public ArrayList<Student> getMinComputerScience() {
        ArrayList<Student> minimumComputerScience = new ArrayList<>();
        int minComputerScience = 101;

        for (Student st : students) {

            if (st.getComputerScience() < minComputerScience) {
                minimumComputerScience.clear();
                minimumComputerScience.add(st);
                minComputerScience = st.getComputerScience();
            } else if (st.getComputerScience() == minComputerScience) {
                minimumComputerScience.add(st);
            }
        }

        return minimumComputerScience;
    }
}