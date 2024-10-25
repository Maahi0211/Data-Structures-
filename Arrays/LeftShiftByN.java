public class LeftShiftByN {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        for (int i=0; i<3; i++){   
            int temp = arr[0]; 
            for (int j=0; j<size-1; j++){
                arr[j] = arr[j+1];
            }
            arr[size-1]=temp;
        }
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
