import java.util.concurrent.ThreadLocalRandom;
class SoolutionFindK{
	int[] nums;
	public int findKthLargest(int[] nums, int k){
		this.nums = nums;
		sort(0,nums.length-1,nums.length-k);
		return nums[nums.length-k];
	}
	void sort(int begin, int end, int k){
		if (begin>=end)
			return;
		int rand = ThreadLocalRandom.current().nextInt(begin,end);
		swap(rand,end);
		int pivot = partition(begin,end);
		if (pivot>k)
			sort(begin,pivot-1,k);
		else if(pivot<k)
			sort(pivot+1,end,k);
		else 
			return;
		
	}

	int partition(int begin, int end){
		int pivot = nums[end];
		int pindex = begin-1;
		for(int i=begin; i<end; i++){
			if(nums[i] < pivot){
				pindex++;
				swap(pindex,i);
			}
		} 
		pindex++;
		swap(pindex,end);
		return pindex;
	}

	void swap(int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}