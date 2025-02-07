package expressions;
import java.util.Stack;
import static expressions.InfixToPostfix.isOperator;

public class PrefixToPostfix {

    public static String prefixToPostfix(String prefix){
        Stack<String> stack=new Stack<>();
        for(int i=prefix.length()-1; i>=0; i--){
            char c=prefix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else if(isOperator(c)){
                String a=stack.pop();
                String b=stack.pop();
                String postfix=a+b+c;
                stack.push(postfix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix="-*+ABC*/D^EFG";
        String postfix=prefixToPostfix(prefix);
        System.out.println("Postfix: "+postfix);
    }
}
