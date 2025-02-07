package expressions;
import java.util.Stack;
import static expressions.InfixToPostfix.isOperator;
public class PostfixToInfix {

    public static String postfixToInfix(String postfix){
        Stack<String> stack=new Stack<>();
        for(int i=0; i<postfix.length(); i++){
            char c=postfix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else if(isOperator(c)){
                String a=stack.pop();
                String b=stack.pop();
                String infix="("+b+c+a+")";
                stack.push(infix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix="AB+C*DEF^/G*-";
        String infix=postfixToInfix(postfix);
        System.out.println("Infix: "+infix);
    }
}
