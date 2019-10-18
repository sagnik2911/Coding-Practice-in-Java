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
		int a[] = array;
		System.out.print("Enter the element you want to find: ");
		int k = Integer.parseInt(scan.next());
		SoolutionFindK sort = new SoolutionFindK();
		int output = sort.findKthLargest(array,k);
		System.out.println("The element at the position is: "+output);
		
		//QuickSort quicksort = new QuickSort();
		//int out[] = quicksort.sort(a,0,array.length-1);
		System.out.print("The sorted array is: ");
		output(array);
	}
	public static void output(int[] A){
		int count = A.length; 
		for (int i = 0; i < count; i++) {
			
			System.out.print(A[i] + " ");
		}
		System.out.println();	
	}
}