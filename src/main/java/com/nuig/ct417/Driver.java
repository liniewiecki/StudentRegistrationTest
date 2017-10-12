package com.nuig.ct417;


import com.nuig.ct417.Course;
import com.nuig.ct417.Module;
import com.nuig.ct417.Student;

import java.util.ArrayList;

public class Driver {
	
	private static int studentcount = 0;

    public static void main(final String... args) {
        final ArrayList<Student> batch1 = new ArrayList<>();
        batch1.add(new Student("Jesse Phoenix", "12-03-1989", studentcount++));
        batch1.add(new Student("Dell MacApple", "12-03-1989", studentcount++));
        batch1.add(new Student("Roger Flopple", "12-03-1989", studentcount++));
        batch1.add(new Student("Demetrius Levenworth", "12-03-1989", studentcount++));
        batch1.add(new Student("Lieutenant Poowhistle", "12-03-1989", studentcount++));
        batch1.add(new Student("Dunk Johnson", "12-03-1989", studentcount++));
        batch1.add(new Student("Lucenzo Diablo", "12-03-1989", studentcount++));
        batch1.add(new Student("Salamander Hammerhead", "12-03-1989", studentcount++));
        batch1.add(new Student("Serge LeMans", "12-03-1989", studentcount++));
        batch1.add(new Student("Flip Jupiter", "12-03-1989", studentcount++));
        batch1.add(new Student("Ed Bed", "12-03-1989", studentcount++));
        batch1.add(new Student("Oliver Revilo", "12-03-1989", studentcount++));
        batch1.add(new Student("Bushwood Parachute", "12-03-1989", studentcount++));
        batch1.add(new Student("Victor Hickory", "12-03-1989", studentcount++));
        batch1.add(new Student("Ferrari Montenegro", "12-03-1989", studentcount++));

        final Module m1 = new Module("Software Engineering", "CT123");
        final Module m2 = new Module("Professional Skills", "CT257");
        final Module m3 = new Module("Databases", "CT875");
        final Module m4 = new Module("Programming Paradigms", "CT298");
        final Module m5 = new Module("Modern Information Management", "CT115");
        final Module m6 = new Module("Mathematics", "MA111");
        final Module m7 = new Module("HCI", "CT556");

        final Course c1 = new Course("Computer Science & IT", "01-09-2013", "30-05-2017");

        //Add individual Student to several modules
        m1.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m2.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m3.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m4.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m5.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m6.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        m7.addStudent(new Student("Lucius Cashmere", "12-03-1989", studentcount++));
        //Add batch of students
        m1.addStudents(batch1);
        m2.addStudents(batch1);
        m3.addStudents(batch1);
        m4.addStudents(batch1);
        m5.addStudents(batch1);
        m6.addStudents(batch1);
        m7.addStudents(batch1);

        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        c1.addModule(m4);
        c1.addModule(m5);
        c1.addModule(m6);
        c1.addModule(m7);

        for (final Student student : c1.getStudents()) {
            System.out.println("--------------- STUDENT ---------------");
            System.out.println("Name:\t" + student.getStudentName());

            System.out.println("DOB:\t" + student.getDob() + "\t" + " -  Age: " + student.getAge());
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
