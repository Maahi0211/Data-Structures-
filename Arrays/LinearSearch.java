import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scn.nextInt();
        arr = new int [n];
        System.out.println("Enter array elements : ");
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int search = scn.nextInt();
        for(int j=0; j<n; j++){
            if(arr[j]==search){
                System.out.println(j);
            }
        }
        scn.close();
    }
}