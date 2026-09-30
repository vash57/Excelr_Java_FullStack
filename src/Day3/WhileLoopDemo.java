//problem statement: Write a program to display 5 times
package Day3;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i = 1;
      while(i<5)
      {
    	  System.out.println("Dev Kumar Chaubey"+i);   //If we are not adding the line no 12 so this code will run infinity times.
    	  i=i+1;
      }
	}

}


/* Output


Dev Kumar Chaubey1
Dev Kumar Chaubey2
Dev Kumar Chaubey3
Dev Kumar Chaubey4

*/
