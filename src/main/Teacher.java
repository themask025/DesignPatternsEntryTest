package main;

public class Teacher {
    private String name;
    private Department department; // Field of type Department

    // Constructor to initialize teacher name and department
    public Teacher(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the department field
    public Department getDepartment() {
        return department;
    }

    // Setter for the department field
    public void setDepartment(Department department) {
        this.department = department;
    }

    // Method to display teacher information
    public void displayTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        department.displayDepartmentInfo(); // Call the method from Department class to display department info
    }
}

