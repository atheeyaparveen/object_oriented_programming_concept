package object_oriented_programing;

public class Bank_AccountMain {

	public static void main(String[] args) {
		Bank_Account bc=new Bank_Account(123456,"abcd",10000);
		bc.depositamount(10);
		bc.withdrawamount(100000);
		bc.displayamt();

	}

}
