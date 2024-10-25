import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []arr = {1, 2, 1, 2, 3, 4, 4, 4, 3, 5, 6};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        int []newarr = new int[set.size()];
        int j = 0;
        for(int i : set){
            newarr[j]=i;
            j++;
        }
        for (int i=0; i<newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}