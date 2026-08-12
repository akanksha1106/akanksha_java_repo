package practisedcodes;
import java.lang.Math;

//class ARR{
//	int arr[] = new int[5];
//}


public class mathsfunctions {
	public static void main(String args[]) {
		
		int arr[][] = new int [3][4];
//		for (int i=0; i<5; i++) {
//			 arr[i] = (int) (Math.random() * 10);
//		System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		for(int[] n : arr) 
		{
			for(int m : n) 
			{
			m = (int) (Math.random() * 10);
			System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}
