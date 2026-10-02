package Day4;

public class AreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//arr[5]=50;  //ArrayIndexOutOfBoundException
		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println(sum);

	}

}

/* Output
150
*/
