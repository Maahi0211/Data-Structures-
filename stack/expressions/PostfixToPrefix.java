package expressions;
import java.util.Stack;
import static expressions.InfixToPostfix.isOperator;
public class PostfixToPrefix {

    public static String postfixToPrefix(String postfix) {
        Stack<String> stack=new Stack<>();
        for(int i=0; i<postfix.length(); i++){
            char c=postfix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }
            else if(isOperator(c)){
                String a=stack.pop();
                String b=stack.pop();
                String prefix=c+b+a;
                stack.push(prefix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix="AB+C*DEF^/G*-";
        String prefix=postfixToPrefix(postfix);
        System.out.println("Prefix: "+prefix);
    }
}
