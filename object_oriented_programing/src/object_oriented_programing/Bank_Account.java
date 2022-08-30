package object_oriented_programing;

public class Bank_Account {
//*********Exercise**********
	// 1.create a Bank_account class
	//2. create private member variables for account number,account name and Account balance
	//3.create methods to deposit and withdraw the amount and to display the current balance
	//4.create an constructor with arguments for account number,name and balance
	//5.create a class BankAccount_main with a main method
	//6.create an object of bank_account
	//7.call the methods to deposit and withdraw the money from bank Account and display the current balance
	
	
	
	private long accnumber;
	private String accname;
	private double accbalance;
	
	public void depositamount(double amt) {
		if(amt>0) {
			accbalance=accbalance+amt;
		System.out.println(" Amount deposited in the account is :"+amt);
		}else {
			System.out.println("amount cannot be deposited " +amt);
		}
	}
	public void withdrawamount(double amt) {
		if(amt>0) {
			accbalance=accbalance-amt;
		System.out.println(" Amount withdrawn in the account is :"+amt);
		}else {
			System.out.println("amount cannot be withdrawn " +amt);
		}
		if(amt>accbalance) {
			System.out.println("your account doesnot have that much of amount");
		}
	}
	public void displayamt() {
		System.out.println("total amount in the account is:"+accbalance);
	}
	
	 public Bank_Account( long accnumber,String accname,double accbalance) {
		 this.accnumber=accnumber;
		 this.accname=accname;
		 this.accbalance=accbalance;
	 }
	
	
}
