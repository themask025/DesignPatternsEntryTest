package main;

import java.util.ArrayList;  // Import ArrayList class

public class Student {
    private String name;                    // Student's name
    private int year;                       // Student's academic year
    private String degree;                  // Degree program (e.g., "Computer Science")
    private ArrayList<Course> courses;      // List of Course objects

    // Constructor to initialize student details
    public Student(String name, int year, String degree) {
        this.name = name;
        this.year = year;
        this.degree = degree;
        this.courses = new ArrayList<>();   // Initialize the ArrayList
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Setter for student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for student year
    public int getYear() {
        return year;
    }

    // Setter for student year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for student degree
    public String getDegree() {
        return degree;
    }

    // Setter for student degree
    public void setDegree(String degree) {
        this.degree = degree;
    }

    // Getter for courses list
    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree);
        System.out.println("Courses:");
        for (Course course : courses) {
            course.displayCourseInfo();  // Call display method for each course
            System.out.println();
        }
    }

    // Method to add a new course
    public void joinCourse(Course newCourse) {
        courses.add(newCourse);  // Add the new course to the ArrayList
        System.out.println("Course added: " + newCourse.getName());
    }
}


