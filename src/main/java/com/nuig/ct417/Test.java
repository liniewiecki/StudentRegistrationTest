package com.nuig.ct417;


import com.nuig.ct417.Course;
import com.nuig.ct417.Module;
import com.nuig.ct417.Student;

import java.util.ArrayList;

public class Test {
	
	private static int studentcount = 0;

    public static void main(final String... args) {
    	
        final ArrayList<Student> studentList  = new ArrayList<>();
        
        studentList.add(new Student("Mary Gibbons", "14-07-1988", studentcount++));
        studentList.add(new Student("Arthur Conan", "12-08-1999", studentcount++));
        studentList.add(new Student("Bob Marley", "03-03-1987", studentcount++));
        studentList.add(new Student("Gerry Moloney", "12-02-1992", studentcount++));
        studentList.add(new Student("Regina darcy", "22-05-1989", studentcount++));
        studentList.add(new Student("Rick Parnanus", "19-04-1993", studentcount++));
        studentList.add(new Student("Danny Okerlund", "13-05-1987", studentcount++));
        studentList.add(new Student("David Bowie", "14-12-1990", studentcount++));
        studentList.add(new Student("Sharon Lee", "19-06-1988", studentcount++));
        studentList.add(new Student("Dagny Valesciennes", "18-01-1989", studentcount++));
        

        final Module module1 = new Module("Programming III", "CT145");
        final Module module2 = new Module("Artificial Intelligence", "CT257");
        final Module module3 = new Module("Databases II", "CT675");
        final Module module4 = new Module("Programming Paradigms", "CT411");
        final Module module5 = new Module("Machine Learning", "CT202");
        final Module module6 = new Module("Mathematics", "MA432");
        final Module module7 = new Module("HCI", "CT642");

        final Course course = new Course("Computer Science & Information Technology", "01-09-2014", "31-08-2018");

        //adding a studnet to several modules
        
        module1.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module2.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module3.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module4.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module5.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module6.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        module7.addStudent(new Student("Rowan Atkinson", "20-12-1990", studentcount++));
        
        //Adding list of students
        module1.addStudents(studentList);
        module2.addStudents(studentList);
        module3.addStudents(studentList);
        module4.addStudents(studentList);
        module5.addStudents(studentList);
        module6.addStudents(studentList);
        module7.addStudents(studentList);

        course.addModule(module1);
        course.addModule(module2);
        course.addModule(module3);
        course.addModule(module4);
        course.addModule(module5);
        course.addModule(module6);
        course.addModule(module7);

        for (final Student student : course.getStudents()) {
            System.out.println("--------------- STUDENT ---------------");
            
            System.out.println("Name of studnet:\t" + student.getStudentName());

            System.out.println("Date Of Birth:\t" + student.getDob() + "\t" + " -  Age: " + student.getAge());
            System.out.println("Username:\t" + student.getUsername());
            
            System.out.println("Student ID:\t" + student.getStudentID());
            System.out.println("\n");
            System.out.println("Course:\t" + student.getCourseName());
            printStudentModules(student);
            System.out.println("---------------------------------------\n");
        }


    }

    public static void printStudentModules(final Student student) {
        System.out.println("\nMODULES:");
        for (final Module module : student.getModules()) {
            System.out.println(module.toString());
        }
    }

}
