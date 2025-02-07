package expressions;
import static expressions.InfixToPostfix.isOperator;
import java.util.Stack;

public class PrefixToInfix {

    public static String prefixToInfix(String prefix){
        Stack<String> stack=new Stack<>();
        for(int i=prefix.length()-1; i>=0; i--){
            char c=prefix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else if(isOperator(c)){
                String a=stack.pop();
                String b=stack.pop();
                String infix="("+a+c+b+")";
                stack.push(infix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix="-*+ABC*/D^EFG";
        String infix=prefixToInfix(prefix);
        System.out.println("Infix: "+infix);
    }
}
