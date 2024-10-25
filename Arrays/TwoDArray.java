import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows=scn.nextInt();
        int cols=scn.nextInt();
        int [][] arr = new int [rows][cols];

        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        scn.close();
    }
}
