import java.util.Random;

public class QuickSelect
{
	public static void swap(int[] A, int i, int j)
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	// Partition using Lomuto partition scheme
	public static int partition(int[] A, int left, int right, int pivotIndex)
	{
		// Pick pivotIndex as pivot from the array
		int pivot = A[pivotIndex];

		// elements less than pivot will be pushed to the left of pIndex
		// elements more than pivot will be pushed to the right of pIndex
		// equal elements can go either way
		int pIndex = left;
		int i;

		// each time we finds an element less than or equal to pivot, pIndex
		// is incremented and that element would be placed before the pivot. 
		for (i = left; i < right; i++)
		{
			if (A[i] <= pivot)
			{
				swap(A, i, pIndex);
				pIndex++;
			}
		}

		// Move pivot to its final place
		swap(A, pIndex, right);

		// return pIndex (index of pivot element)
		return pIndex;
	}

	// Returns the k-th smallest element of list within left..right
	// (i.e. left <= k <= right). The search space within the array is
	// changing for each round - but the list is still the same size.
	// Thus, k does not need to be updated with each round.
	public static int quickSelect(int[] A, int left, int right, int k)
	{
		// If the array contains only one element, return that element
		if (left == right) {
			return A[left];
		}

		// select a pivotIndex between left and right
		int pivotIndex = right;

		pivotIndex = partition(A, left, right, pivotIndex);
		System.out.println(pivotIndex);
		// The pivot is in its final sorted position
		if (k == pivotIndex) {
			return A[k];
		}
		
		// if k is less than the pivot index
		else if (k < pivotIndex) {
			return quickSelect(A, left, pivotIndex - 1, k);
		}
		
		// if k is more than the pivot index
		else {
			return quickSelect(A, pivotIndex + 1, right, k);
		}
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 7, 4, 6, 3, 9, 1 };
		int k = 2;

		System.out.print("K'th smallest element is "
						+ quickSelect(A, 0, A.length - 1, k));
	}
}