import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size : ");
        int size = scn.nextInt();
        int [] arr = new int [size];
        for (int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }
        int max = arr[0];
        int secondMax = arr[1];
        for (int i=0; i<size; i++){
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest element of array is "+secondMax );
        scn.close();
    }
}