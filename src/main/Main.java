package main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Department departmentAlgebra = new Department("Algebra");
		Teacher teacherAlgebra = new Teacher("Dimitar Petrov", departmentAlgebra);
		Course courseAlgebra = new Course("Algebra", teacherAlgebra, 8, false, 0);

		Student student = new Student("Kiril Ivanov", 1, "Computer science");
		
		student.joinCourse(courseAlgebra);
		student.displayStudentInfo();
		
		Department departmentCompSystems = new Department("Computer systems");
		Teacher teacherProgramming = new Teacher("Dimitar Petrov", departmentCompSystems);
		Course courseProgramming = new Course("Programming", teacherProgramming, 7, false, 0);
		
		student.joinCourse(courseProgramming);
		student.displayStudentInfo();
	}
}
