package main;

public class Course {
    private String name;
    private Teacher teacher;   // Field of type Teacher
    private int credits;
    private boolean passed;    // Boolean field to indicate if the course was passed
    private double grade;      // Field for the grade

    // Constructor to initialize all fields
    public Course(String name, Teacher teacher, int credits, boolean passed, double grade) {
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
        this.passed = passed;
        this.grade = grade;
    }

    // Getter for the course name
    public String getName() {
        return name;
    }

    // Setter for the course name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the teacher field
    public Teacher getTeacher() {
        return teacher;
    }

    // Setter for the teacher field
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Getter for the credits
    public int getCredits() {
        return credits;
    }

    // Setter for the credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Getter for the passed field
    public boolean isPassed() {
        return passed;
    }

    // Setter for the passed field
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    // Getter for the grade
    public double getGrade() {
        return grade;
    }

    // Setter for the grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Passed: " + (passed ? "Yes" : "No"));
        if(grade >= 2)
        	System.out.println("Grade: " + grade);
        else
        	System.out.println("Has not attended exam.");

    }
}


