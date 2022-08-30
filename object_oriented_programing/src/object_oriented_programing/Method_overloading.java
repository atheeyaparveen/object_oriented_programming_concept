package object_oriented_programing;

public class Method_overloading {
	
	//*METHOD OVERLOADING
	
	//*diff  methods/function inside the same class should have the following 
	//*diff data type
	//*diff number of arguments
	//*diff order of arguments
	
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}
	public void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void addition(double a, double b) {
		System.out.println(a+b);
	}
	public void addition(int a, double b) {
		System.out.println(a+b);
		
	}
	public void addition(double a, int b) {
		System.out.println(a+b);
		
	}
	
	
	

	public static void main(String[] args) {
	
		 Method_overloading over=new  Method_overloading();
				 over.addition(10, 10);
				 over.addition(20.3, 20);
				 over.addition(20, 1.2);
				 over.addition(20.2, 10.3);
	}

}
