import java.util.Scanner;

public class LargestElement {
    public static void main(String [] args){
        int []arr;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scn.nextInt();
        arr = new int [size];
        System.out.println("Enter array : ");
        for (int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }
        int max = arr[0];
        for (int i=1; i<size; i++){
            if(arr[i] > max)
            max=arr[i];
        }
        System.out.println("Maximum number in array is "+max);
        scn.close();
    }
}
