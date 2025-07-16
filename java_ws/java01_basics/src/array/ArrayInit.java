package array;

public class ArrayInit {
	public static void main(String ...args) {
//		int[] arr = new int[4];
//		int[] arr = new int[] {0,0,0,0,0};
		int[] arr = {0,0,0,0,0};
		
		arr[3] = 4;
		
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		
	}
}
