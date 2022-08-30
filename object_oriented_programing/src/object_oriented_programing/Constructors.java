package object_oriented_programing;

public class Constructors {
	//***constructor concept****
	// 1 .create a road_toll class
	// 2. create member variables for type of vehicle,number of tires
	//3. create a method to calculate the toll amount depending upon the number of tires for a vehicle
	//    if tires count==2 then toll amount is 0
     //  if tires count==4 then toll amount is 10
      //  if tires count>4 then toll amount is 20
	//4.create a roadtoll_main class with main method
	//5.create object of road_toll
	//6. assign values to member variables of class and call the method to calculate the toll
	//7. create a constructor in road_toll class
	//8.create object of road_toll class using new constructor
	

	
	String typeofvahicle;
	int numoftires;
	
	public void tollamount() {
		if(numoftires==2) {
			System.out.println("the toll amount is 0");
		}else if(numoftires==4) {
			System.out.println("the toll amount is 10");
		}else if(numoftires>4) {
			System.out.println("the toll amount is 20");
		}else {
			System.out.println("incorrect toll");
	}}
		
	public  Constructors() {
		System.out.println("toll constructer executed");
	}
	
	public  Constructors (String typeofvahicle ,int numoftires) {
		this.typeofvahicle=typeofvahicle;
		this.numoftires=numoftires;
	}

}