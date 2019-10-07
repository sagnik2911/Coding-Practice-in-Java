import java.util.*;

public class UserInput {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Array Length: ");
		int count = Integer.parseInt(scan.nextLine());
		int i = 0;
		int array[] = new int[count];
		for (i = 0; i < count; i++){
			System.out.print("Enter number"+ (i+1) +" : " );
			array[i] = Integer.parseInt(scan.next());
		}
		System.out.print("The Input array is: ");
		output(array);
		QuickSort sort = new QuickSort();
		int output[] = sort.sort(array,0,array.length-1);
		System.out.print("The sorted array is: ");
		output(output);
	}
	public static void output(int[] A){
		int count = A.length; 
		for (int i = 0; i < count; i++) {
			
			System.out.print(A[i] + " ");
		}
		System.out.println();	
	}
}