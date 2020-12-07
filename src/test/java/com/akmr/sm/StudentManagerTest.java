package com.akmr.sm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentManagerTest {

    @Test
    public void testGetMaxPhysicsSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 12 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);

        assertEquals(expected, studentManager.getMaxPhysics());
    }

    @Test
    public void testGetMaxPhysicsMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);
        expected.add(student4);

        assertEquals(expected, studentManager.getMaxPhysics());
    }

    @Test
    public void testGetMaxChemistrySingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);

        assertEquals(expected, studentManager.getMaxChemistry());
    }

    @Test
    public void testGetMaxChemistryMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);
        expected.add(student6);

        assertEquals(expected, studentManager.getMaxChemistry());
    }

    @Test
    public void testGetMaxMathsSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        assertEquals(expected, studentManager.getMaxMaths());
    }

    @Test
    public void testGetMaxMathMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 88 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student5);

        assertEquals(expected, studentManager.getMaxMaths());
    }

    @Test
    public void testGetMaxEnglishSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        assertEquals(expected, studentManager.getMaxEnglish());
    }

    @Test
    public void testGetMaxEnglishMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 100 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 100 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);
        expected.add(student4);

        assertEquals(expected, studentManager.getMaxEnglish());
    }

    @Test
    public void testGetMaxCSSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 96".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        assertEquals(expected, studentManager.getMaxComputerScience());
    }

    @Test
    public void testGetMaxCSMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student5);

        assertEquals(expected, studentManager.getMaxComputerScience());
    }
    //min
    @Test
    public void testGetMinPhysicsSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 12 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);

        assertEquals(expected, studentManager.getMinPhysics());
    }

    @Test
    public void testGetMinPhysicsMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 13 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);
        expected.add(student6);

        assertEquals(expected, studentManager.getMinPhysics());
    }

    @Test
    public void testGetMinChemistrySingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 47 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        assertEquals(expected, studentManager.getMinChemistry());
    }

    @Test
    public void testGetMinChemistryMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 17 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student5);

        assertEquals(expected, studentManager.getMinChemistry());
    }

    @Test
    public void testGetMinMathsSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student6);

        assertEquals(expected, studentManager.getMinMaths());
    }

    @Test
    public void testGetMinMathMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 23 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);
        expected.add(student6);

        assertEquals(expected, studentManager.getMinMaths());
    }

    @Test
    public void testGetMinEnglishSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 24 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student6);

        assertEquals(expected, studentManager.getMinEnglish());
    }

    @Test
    public void testGetMinEnglishMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 100 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 100 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 28 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);
        expected.add(student6);

        assertEquals(expected, studentManager.getMinEnglish());
    }

    @Test
    public void testGetMinCSSingleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 96".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 60 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 36 23 54 25".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);

        assertEquals(expected, studentManager.getMinComputerScience());
    }

    @Test
    public void testGetMinCSMultipleResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 16 74 36 75 55".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);
        expected.add(student6);

        assertEquals(expected, studentManager.getMinComputerScience());
    }

    //pass

    @Test
    public void testGetNoPassPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getPassPhysics());
    }

    @Test
    public void testGetPassPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);



        assertEquals(expected, studentManager.getPassPhysics());
    }
    @Test
    public void testGetMultiplePassPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);


        assertEquals(expected, studentManager.getPassPhysics());
    }

    @Test
    public void testGetNoPassChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 12 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 12 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 16 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 16 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 12 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getPassChemistry());
    }

    @Test
    public void testGetPassChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 12 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 12 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 16 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 16 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 92 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student6);



        assertEquals(expected, studentManager.getPassChemistry());
    }
    @Test
    public void testGetMultiplePassChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student5);
        expected.add(student6);



        assertEquals(expected, studentManager.getPassChemistry());
    }


    @Test
    public void testGetNoPassMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 15 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 18 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 14 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 17 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getPassMaths());
    }

    @Test
    public void testGetPassMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 18 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 14 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 17 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 13 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);



        assertEquals(expected, studentManager.getPassMaths());
    }
    @Test
    public void testGetMultiplePassMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student5);

        assertEquals(expected, studentManager.getPassMaths());
    }

    @Test
    public void testGetNoPassEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 19 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 15 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 19 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 16 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 18 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 14 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getPassEnglish());
    }

    @Test
    public void testGetPassEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 9 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 19 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 16 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 2 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 5 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);



        assertEquals(expected, studentManager.getPassEnglish());
    }
    @Test
    public void testGetMultiplePassEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student6);


        assertEquals(expected, studentManager.getPassEnglish());
    }

    @Test
    public void testGetNoPassCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 99 16".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 15".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 15".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getPassComputerScience());
    }

    @Test
    public void testGetPassCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 16".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 15".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 95".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student4);



        assertEquals(expected, studentManager.getPassComputerScience());
    }
    @Test
    public void testGetMultiplePassCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student4);


        assertEquals(expected, studentManager.getPassComputerScience());
    }

    //fail


    @Test
    public void testGetNoFailPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 83 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 87 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 77 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 73 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 74 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getFailPhysics());
    }

    @Test
    public void testGetFailPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 57 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 63 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 74 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);



        assertEquals(expected, studentManager.getFailPhysics());
    }
    @Test
    public void testGetMultipleFailPhysicsResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 23 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 27 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student5);
        expected.add(student6);


        assertEquals(expected, studentManager.getFailPhysics());
    }

    @Test
    public void testGetNoFailChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 97 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 82 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 76 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 76 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 62 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getFailChemistry());
    }

    @Test
    public void testGetFailChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 97 18 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 82 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 76 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 26 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 92 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student5);



        assertEquals(expected, studentManager.getFailChemistry());
    }
    @Test
    public void testGetMultipleFailChemistryResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 22 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 22 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 26 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 22 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student6);



        assertEquals(expected, studentManager.getFailChemistry());
    }


    @Test
    public void testGetNoFailMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 98 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 75 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 68 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 84 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 97 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 83 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getFailMaths());
    }

    @Test
    public void testGetFailMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 98 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 18 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 94 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 87 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 73 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);



        assertEquals(expected, studentManager.getFailMaths());
    }
    @Test
    public void testGetMultipleFailMathResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 98 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 15 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 18 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 14 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);
        expected.add(student6);

        assertEquals(expected, studentManager.getFailMaths());
    }

    @Test
    public void testGetNoFailEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 65 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 69 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 66 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 68 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 84 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getFailEnglish());
    }

    @Test
    public void testGetFailEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 69 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 76 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 72 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 15 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student6);



        assertEquals(expected, studentManager.getFailEnglish());
    }
    @Test
    public void testGetMultipleFailEnglishResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 66".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 45".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 29 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 26 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 18 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student3);
        expected.add(student4);
        expected.add(student5);


        assertEquals(expected, studentManager.getFailEnglish());
    }

    @Test
    public void testGetNoFailCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 16 17 88 99 96".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 75".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 66".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 75".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 85".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();



        assertEquals(expected, studentManager.getFailComputerScience());
    }

    @Test
    public void testGetFailCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 96 17 88 99 96".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 13 42 35 75 95".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 17 72 48 49 76".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 17 46 74 36 95".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 65".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student6);



        assertEquals(expected, studentManager.getFailComputerScience());
    }
    @Test
    public void testGetMultipleFailCSResult(){
        StudentManager studentManager = new StudentManager();

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = studentManager.makeStudent("Anmol Pratap Meerut 77 66 17 88 99 16".split(" "));
        Student student2 = studentManager.makeStudent("Aahaana Danavarsh Gujrat 22 43 42 35 75 15".split(" "));
        Student student3 = studentManager.makeStudent("Aadhish Fravash Delhi 74 67 72 48 49 16".split(" "));
        Student student4 = studentManager.makeStudent("Bhavan Hansh Hapur 34 67 46 74 36 75".split(" "));
        Student student5 = studentManager.makeStudent("Bhavik Hari Goa 34 13 46 37 28 15".split(" "));
        Student student6 = studentManager.makeStudent("Dabeet Jagesh Mumbai 43 14 72 23 54 15".split(" "));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);


        studentManager.setStudents(students);

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student5);
        expected.add(student6);



        assertEquals(expected, studentManager.getFailComputerScience());
    }
}

