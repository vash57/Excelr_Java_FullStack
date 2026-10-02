package Day4;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Length: ");
      int length = sc.nextInt();
      System.out.println("Enter Breadth: ");
      int breadth = sc.nextInt();
      
      int area = length*breadth;
      System.out.println("Area of Reactangle is: "+area);
	}

}


/*Output

Enter Length: 
7
Enter Breadth: 
3
Area of Reactangle is: 21

*/
