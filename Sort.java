public class Sort{
	public int[] bubblesort(int[] A){
		int pass, i, temp; 
		boolean swapped = true;
		for (pass = A.length - 1; pass >= 0 && swapped; pass--){
			swapped = false;
			for (i = 0; i<= pass - 1; i++){
				if (A[i] > A[i+1]){
					//swap elemnts
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					swapped = true;
				}
			}	
		}
	return A;
	}

	public int[] selectionsort(int[] A){
		int i, j, min, temp;
		for (i =0; i < A.length-1; i++){
			min = i;
			for (j = i+1; j < A.length; j++){
				// find the the least ith elemnt position
				if (A[j] < A[min])
					min = j;
			}
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
	return A;
	}

	public void print(int i, int j, int k){
		System.out.print("Main Pass: "+ i + " Loop pass: "+ j );
		System.out.println();
	}

	public int[] insertionsort(int[] A){
		int i,j,swap;
		for (i = 1; i < A.length; i++){
			swap = A[i];
			j = i;
			while (j >= 1 && A[j-1] > swap){
				//print (i,j,swap);
				A[j] = A[j-1];
				j--;
			}
			//System.out.print(j);
			A[j] = swap;
		}
	return A;
	}

	public int[] countingsort(int[] A){
		int i = 0, max = -1;
		for (i = 0; i < A.length; i++){
			max = Math.max(max, A[i]);
		}
		max ++;
		int C[] = new int[max];
		int B[] = new int[A.length];
		for (i = 0;i < max; i++)
			C[i]=0;

		for (i = 0;i < A.length; i++)
			C[A[i]] = C[A[i]]+1;

		output(C);
		
		for (i = 1;i < max; i++)
			C[i]=C[i]+C[i-1];
		output(C);
		for (i = max-1;i > 0; i--)
			C[i]=C[i-1];
		C[0] = 0;
		output(C);
		for (i = 0;i < A.length; i++){
			B[C[A[i]]] = A[i];
			C[A[i]]++;
		}
		//System.out.println(max);
		return B;
	}

	public void output(int[] A){
		int count = A.length; 
		for (int i = 0; i < count; i++)
			System.out.print(A[i] + " ");
		System.out.println();	
	}
}