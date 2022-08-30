package object_oriented_programing;

public class Constructor_main {

	public static void main(String[] args) {
		Constructors toll=new Constructors();
		toll.numoftires=4;
		toll.typeofvahicle= "sudan";
         toll.tollamount();
         Constructors toll1=new Constructors("hero",6);
         toll1.tollamount();
	}

}
