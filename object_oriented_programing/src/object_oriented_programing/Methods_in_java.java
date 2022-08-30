package object_oriented_programing;

public class Methods_in_java {
	
	//1.create a method in java
	//2.how does a method return value??
	
	public static void main(String[] args) {
		
		Methods_in_java mh= new Methods_in_java();
		mh.addition(20, 30);
		 int x=mh.divide(40, 20);
	     System.out.println(x);
	     mh.multiplecation(40, 30);
	//	mh.divide(40, 20);
		
		
	}

	public void execution() {
		System.out.println("do this execution");
	}
    public void multiplecation(int a,int b) {
	System.out.println(a*b);
}
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public int divide(int a,int b) {
		int c=a/b;
		return c;
	}
//	public int divide(int a,int b) {
//     System.out.println(a/b);
//     return 0;
//       }
}