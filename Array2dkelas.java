import java.util.Scanner;

	class Array2dkelas{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			int [][] arr= new int[3][3];
			int [][] arr2= new int[3][3];
			int i, j, k;
				for(i=0; i<arr.length; i++){
					for(j=0; j<arr.length; j++){
				arr[i][j]=xx.nextInt();
				}	
				}
				for(i=0; i<arr2.length; i++){
					for(j=0; j<arr2.length; j++){
				arr2[i][j]=xx.nextInt();
				}	
				}
				for(i=0; i<arr.length; i++){
					for(j=0; j<arr.length; j++){
				arr[i][j]+=arr2[i][j];
				}	
				}
				for(i=0; i<arr.length; i++){
					System.out.println();
					for(j=0; j<arr.length; j++){
						System.out.print(arr[i][j]+" ");
				}	
				}
				}
				}