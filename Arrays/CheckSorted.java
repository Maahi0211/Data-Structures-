import java.util.Scanner;

public class CheckSorted{
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scn.nextInt();
        int []arr = new int [size];
        int isSorted = 1;
        System.out.println("enter array elements : ");
        for (int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }
        for (int i=0; i<size-1; i++){
            if (arr[i]>arr[i+1]) {
                isSorted = 0;
            }
        }
        if(isSorted == 1){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Unsorted");
        }
        scn.close();
    }
}