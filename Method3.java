package ecl;

public class Method3 {
	public static void main(String [] args) {
		int [] arr= {7, 3, 9, 1};
		printArray(arr);
		System.out.println(getElement(arr, 2));
	}
	public static void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int getElement(int [] arr, int i) {
		if(i<0 || i>=arr.length) {
			return 0;
		}
		return arr[i];
	}
}
