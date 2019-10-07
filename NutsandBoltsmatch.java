//Java Program to match nuts and bolts, where a nut can only be compared with bolts and vice versa.
public class NutsandBoltsmatch{
	public static void main(String[] args) 
    { 
        // Nuts and bolts are represented as array of characters 
        char nuts[] = {'@', '#', '$', '%', '^', '&'}; 
        char bolts[] = {'$', '%', '&', '^', '#', '@'}; 
  
        // Method based on quick sort which matches nuts and bolts 
        matchPairs(nuts, bolts, 0, 5); 
  
        System.out.println("Matched nuts and bolts are : "); 
        printArray(nuts); 
        printArray(bolts); 
    } 
  
    // Method to print the array 
    private static void printArray(char[] arr) { 
        for (char ch : arr){ 
            System.out.print(ch + " "); 
        } 
        System.out.println("n"); 
    } 
  
    // Method which works just like quick sort 
    private static void matchPairs(char[] nuts, char[] bolts, int low, 
                                                              int high) 
    { 
        if (low < high) 
        { 
            // Choose last character of bolts array for nuts partition. 
            int pivot = partition(nuts, low, high, bolts[high]); 
  
            // Now using the partition of nuts choose that for bolts 
            // partition. 
            partition(bolts, low, high, nuts[pivot]); 
  			System.out.println("Nuts");
  			printArray(nuts);
  			System.out.println("Bolts");
  			printArray(bolts);
            // Recur for [low...pivot-1] & [pivot+1...high] for nuts and 
            // bolts array. 
            matchPairs(nuts, bolts, low, pivot-1); 
            matchPairs(nuts, bolts, pivot+1, high); 
        } 
    } 
  
    // Similar to standard partition method. Here we pass the pivot element 
    // too instead of choosing it inside the method. 
    private static int partition(char[] arr, int low, int high, char pivot) 
    { 
        int i = low; 
        char temp1, temp2; 
        for (int j = low; j < high; j++) 
        { 
            if (arr[j] < pivot){ 
                temp1 = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp1; 
                i++; 
            } else if(arr[j] == pivot){ 
                // a modification of existing quick sort algo, when it matches with pivot, pivot is pushed to last
                //j gets decremented so that the last elemnt which swapped can took part in partioning
                temp1 = arr[j]; 
                arr[j] = arr[high]; 
                arr[high] = temp1; 
                j--; 
            } 
        } 
        temp2 = arr[i]; 
        arr[i] = arr[high]; 
        arr[high] = temp2; 
  
        // Return the partition index of an array based on the pivot  
        // element of other array. 
        return i; 
    } 
}