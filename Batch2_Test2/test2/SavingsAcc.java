package test2;

import java.util.Scanner;

class FixedAcc {
	 Scanner s=new Scanner(System.in);
	 double balance;
	 void set()
	 {
		 System.out.println("enter balance");
		 balance=s.nextFloat();
	 }
	void calculateInterest(double interest)
	{
		System.out.println("interest on your balance is :"+(balance*interest)/100);
	}
}
	public class SavingsAcc extends FixedAcc
	{
		void calculateInterest(double interest)
		{
			System.out.println("interest on your balance is :"+(balance*interest)/100);

		}
	
	public static void main(String args[])
	{
		
		FixedAcc obj=new FixedAcc();
		obj.set();
		obj.calculateInterest(20);
				
	}

}
