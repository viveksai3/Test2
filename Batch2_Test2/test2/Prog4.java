package test2;

import java.util.Scanner;

public class Prog4
{
    static int getNumber(int number, int digit)
    {
        char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
            	System.out.println("the number is:");
            	return i;
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args)
    {
    	int number;
    	int digit;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the number");
    	number=s.nextInt();
    	System.out.println("enter the digit");
    	digit=s.nextInt();
        System.out.println(getNumber(number, digit));
        
    }
}