package test2;

import java.util.Scanner;

public class Salary {
	Scanner s=new Scanner(System.in);
	double basicSal;
	 void salCalculate()
	{
		System.out.println("enter basic salary:");
		basicSal=s.nextFloat();
		double hra=(basicSal*50)/100;
		double speciallowance=(basicSal*75)/100;
		
		double pf=(basicSal*12)/100;
		double netPayableSal=((basicSal+hra+speciallowance)-pf);
		System.out.println("Net payable salary :"+netPayableSal);
		
	}
	public static void main(String args[])
	{
		Salary sal=new Salary();
		sal.salCalculate();
	}

}
