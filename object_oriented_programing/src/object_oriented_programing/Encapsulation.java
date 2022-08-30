package object_oriented_programing;

public class Encapsulation {
	
	//***data hiding****
    // hiding the member variable of the call from other classes
	
	//********student example*******
	 private String subject;
	private int studentcount;
	
	public void number_of_student() {
		System.out.println("In  "+subject+ " subject there are :"+studentcount+ " students");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentcount() {
		return studentcount;
	}

	public void setStudentcount(int studentcount) {
		this.studentcount = studentcount;
	}

}
