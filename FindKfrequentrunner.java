import java.util.*;

public class FindKfrequentrunner{
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
		System.out.print("Enter the element you want to find: ");
		int k = Integer.parseInt(scan.next());
		TopKFrequent run = new TopKFrequent();
		int out[] = run.topKFrequent(array,k);
		output(out);
	}
	public static void output(int[] A){
		int count = A.length; 
		for (int i = 0; i < count; i++) {
			
			System.out.print(A[i] + " ");
		}
		System.out.println();	
	}
}