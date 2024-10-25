import java.util.*;

public class UnionArrayOptimalSol {
    public static void main(String[] args) {
        int []arr1 = {1, 1, 2, 5, 7, 9};
        int []arr2 = {1, 2, 3, 4, 6, 8};
        Vector<Integer> vec = new Vector<>();
        int i = 0;
        int j=0;
        while (i != arr1.length || j != arr2.length){
            if(arr1[i] == arr2[j]) {
                vec.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]){
                vec.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                vec.add(arr2[j]);
                j++;
            }

            //to be continue
        }
    }
}
