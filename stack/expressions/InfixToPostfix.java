package expressions;
import java.util.Stack;
public class InfixToPostfix {

    public static int priority(char operator){
        switch(operator){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    public static String infixToPostfix(String infix){
        Stack<Character> stack=new Stack<>();
        StringBuilder postfix=new StringBuilder();
        for(int i=0; i<infix.length(); i++){
            char c=infix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek() !='('){
                    postfix.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
            else if(isOperator(c)){
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(c)){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix="(A+B)*C-(D/E^f)*G";
        String postfix=infixToPostfix(infix);
        System.out.println("Postfix: "+postfix);
    }
}
