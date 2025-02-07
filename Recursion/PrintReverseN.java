public class PrintReverseN {
    public static void printReverse(int n){
        if(n!=0){
            System.out.println(n);
            printReverse(n-1);
        }
    }

    public static void main(String[] args) {
        printReverse(10);
    }
}
