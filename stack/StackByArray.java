import java.util.*;

public class StackByArray {
    private int [] stack;
    private int top;
    private int capacity;

    public StackByArray(int size){
        stack=new int[size];
        top=-1;
        capacity=size;
    }

    public void push(int x){
        if(top==capacity-1){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0; i<=top; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        StackByArray stack=new StackByArray(size);

        while(true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. display");
            System.out.println("select choice");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    int x=sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    System.out.println(stack.pop());
                    break;

                case 3:
                    System.out.println(stack.peek());
                    break;

                case 4:
                    stack.display();
                    break;

                default:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
