import java.util.*;
public class SawToothWaveArray{
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
		int output[] = convert(array);
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
	public static int[] convert(int[] A){
		for(int i = 1; i < A.length; i += 2){
			if (i>0 && A[i-1] > A[i])
				swap(A,i,i-1);
			output(A);
			if (i<A.length-1 && A[i] < A[i+1])
				swap(A,i,i+1);
			output(A);
		}
		return A;
	}
	public static void swap(int[] A,int i,int j){
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
	}
}