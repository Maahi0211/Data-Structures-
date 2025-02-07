public class PrintN {
    public static void printN(int n){
        if(n!=0){
            printN(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printN(10);
    }
}
