public class MoveZeros {
    public static void main(String[] args) {
        int []arr = {0, 1, 0, 2, 0, 3, 0, 0, 9, 8, 0, 11};
        int size = arr.length;
        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-1; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
     