package object_oriented_programing;

public class Employee_class {
	//****class Example***
	//1. create an employee class
	//2.create class variable for employee name,employee id, employee salary
	//3.create a method to calculate and display employee bonus(20% of employee salary)
	//4.create an employee_main class in employee_main
	//5.create 2 objects of employee class in employee_main
	//6.assign values to variables and call the method from employee class by using the object created in step5
	
	
	String empname;
	int empid;
	double empsalary;
	
	public void employdisplay() {
		System.out.println(empname+ " employee get the salary with bonus 20% :" +(empsalary*0.2));
	}

}
