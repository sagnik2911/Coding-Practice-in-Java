import java.util.*;
public class TopKFrequent{
	public int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap();
		for (int n:nums){
			map.put(n,map.getOrDefault(n,0)+1);
		}
		
		PriorityQueue<Integer> heap = new PriorityQueue((n1,n2) -> map.get(n1)-map.get(n2));

		for (int n: map.keySet()){
			heap.add(n);
			//System.out.println(Arrays.toString(heap.toArray()));
			System.out.println(heap.toArray());
			if (heap.size()>k)
				System.out.println("Key removed: "+heap.poll());
		}

		List<Integer> top_k = new LinkedList();
		while(!heap.isEmpty())
			top_k.add(heap.poll());
		Collections.reverse(top_k);
		int[] array = top_k.stream().mapToInt(i->i).toArray();
		return array;
	}
}