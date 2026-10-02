package Day4;

import java.util.Scanner;

public class AreaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter age of person: "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		//display all numbers from arrays
		System.out.println("Display all numbers from array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		
		//display odd numbers from array
		System.out.println("\n Display Odd numbers from array: ");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==1)
					sum=sum+arr[i];
		}
		System.out.println("Sum of odd numbers is: "+sum);
	}

}

/*Output
Enter age of person: 1
3
Enter age of person: 2
5
Enter age of person: 3
7
Enter age of person: 4
9
Enter age of person: 5
11
Display all numbers from array: 
3	
5	
7	
9	
11	

 Display Odd numbers from array: 
Sum of odd numbers is: 35

*/
