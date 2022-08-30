package object_oriented_programing;

public class Employee_main {

	public static void main(String[] args) {
		 Employee_class emp1=new  Employee_class();
		 Employee_class emp2=new  Employee_class();
		 
		 emp1.empid=121;
		 emp1.empname="asda";
		 emp1.empsalary=2000;
		 
		 emp2.empid=111;
		 emp2.empname="esdr";
		 emp2.empsalary=3000;
		 
		 
		 emp1.employdisplay();
		 emp2.employdisplay();
		 

	}

}
