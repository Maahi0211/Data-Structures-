import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 5, 7};
        int []arr2 = {1, 2, 3, 4, 6};
        Set <Integer> union = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            union.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++){
            union.add(arr2[i]);
        }
        int []arr3 = new int[union.size()];
        int index = 0;
        for (int i : union){
            arr3[index] = i;
            index++;
        }

        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }

    }

}
