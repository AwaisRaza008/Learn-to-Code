import java.util.*;
// calculate factorial of any number...
class Factorial
{
	public static void main(String arg[])
	
	{
         long n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number : ");
	   
            n=sc.nextLong();// this will take input any number from user
 
	    for(int i=1;i<=n;i++)
	    {
	
	    fact=fact*i; // calculate the factorial of a number 
 	    }
  	    System.out.printf("fact = ",fact);
 	}
}
 
