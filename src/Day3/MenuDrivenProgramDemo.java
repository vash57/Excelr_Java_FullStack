package Day3;

import java.util.Scanner;

public class MenuDrivenProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number 1: ");
       int num1=sc.nextInt();
       System.out.println("Enter Number 2: ");
       int num2=sc.nextInt();
       int choice=0;
       do
       {
    	   System.out.println("*** Menu ***");       
   		System.out.println("1. Addition"); 
   		System.out.println("2. Substraction"); 
   		System.out.println("3. Multiplication"); 
   		System.out.println("4. Division");
   		System.out.println("0. Exit");
   		System.out.println("Enter Choice: ");
   		choice=sc.nextInt();
   		double result=0.0;
   		switch(choice)
   		{
   		case 1: result=num1+num2; break;
		case 2: result=num1-num2; break;
		case 3: result=num1*num2; break;
		case 4: result=(double)num1/(double)num2; break;
		case 0: System.exit(0);
		default : System.out.println("Invalid Input");
   		}
   		System.out.println("Result is "+result);
       }while(choice!=0);
	}

}

/* Output: 
Enter Number 1: 
45
Enter Number 2: 
32
*** Menu ***
1. Addition
2. Substraction
3. Multiplication
4. Division
0. Exit
Enter Choice: 
3
Result is 1440.0

*/
