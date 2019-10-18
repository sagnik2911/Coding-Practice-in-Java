import java.util.*;

public class Ttest {
	public static void main(String[] args){
        int arr[][] = {{7,5},{2,11},{3,9}};
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(final int[] n1, final int[] n2){
                return n1[0] - n2[0]; 
            }
        });
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        }
    }
}