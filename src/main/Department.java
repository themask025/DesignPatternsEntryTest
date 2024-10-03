package main;

public class Department {
    // Field to store department name
    private String name;

    // Constructor to initialize department name
    public Department(String name) {
        this.name = name;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Method to display department information
    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + name);
    }
}

