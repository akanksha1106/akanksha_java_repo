package practisedcodes;

public class array {
	public void insertion(int arr[], int k) {
		//Right rotation
		int n = arr.length;

			int temp = arr[n-1];
			for(int  j=arr.length-1;  j>0;  j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		array obj = new array();
		int arr1[]= {10,20,30,40,50};
		obj.insertion(arr1, 1);
	}
}