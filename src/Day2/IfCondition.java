package Day2;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage: ");       //AdultAndMinor     age>=18
		
		double percentage=sc.nextDouble();  //percentage=38.5
		
		
		if(percentage>=40.0)  //  is 38.5>=40.0  false   if will be skipped
		{					  
			System.out.println("Pass");   
		}
		else			
		{
			System.out.println("Not Pass");   //display "Not Pass"
		}

		
		System.out.println("Thank You!!!");  //display" Thank You!!!
	}

}

/* Output

Enter your percentage: 
89.2
Pass
Thank You!!!
*/