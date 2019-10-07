public class QuickSort{
	public int[] sort(int A[],int low, int high){
		if (low<high){
			int pivot = partition(A,low,high);
			sort(A,low,pivot-1);
			sort(A,pivot+1,high);
		}
		return A;
	}

	int partition(int A[],int low,int high){
		int pivot = A[high];
		int pindex = low-1;
		for (int i=low; i<high; i++){
			if (A[i] < pivot){
				pindex++;
				swap(A,i,pindex);
			}
		}
		swap(A,high, pindex+1);
	return pindex+1;
	}

	void swap(int A[],int i,int j){
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
	}
}