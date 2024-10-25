import java.util.Scanner;

public class MissingValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int []arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }
        int i;
        for (i=0; i<=size; i++){
            int flag = 0;
            for (int j=0; j<size; j++){
                if (arr[j] == i){
                    flag = 1;
                }
            }
            if (flag == 0){
                System.out.println(i);
            }
            scn.close();
        }
        
    }
}
