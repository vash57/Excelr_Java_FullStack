package Day4;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,18,25,40,29};
		
		//display all  numbers from array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		//display odd numbers from array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println("All Odd Numbers:"+arr[i]);
			}
		
			
			//display sum of odd numbers from array
			
		}
		
		int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==1) {
					sum=sum+arr[i];
					
				}
				
			}
			System.out.println("Sum of odd number is "+sum);
			
		}

	}

/*Output
23	18	25	40	29	
All Odd Numbers:23
All Odd Numbers:25
All Odd Numbers:29
Sum of odd number is 77
*/
