package test2;

import java.util.Scanner;
class AgeLimitFailureException extends Exception{
	public AgeLimitFailureException(String s)
	{
		super(s);
}
}

public  class Sammy {
	Scanner s=new Scanner(System.in);
	void info() throws AgeLimitFailureException
	{
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter contact number");
		long phnoneNumber=s.nextLong();
		System.out.println("enter age");
		int age=s.nextInt();
		if((age<20) || age>55)
			throw new AgeLimitFailureException("entered age is not accepted");
			
		else 
		{
			System.out.println("accepted");
		}
		}
	
	public static void main(String args[]) throws AgeLimitFailureException
	{
		Sammy s=new Sammy();
		s.info();
	}

}
