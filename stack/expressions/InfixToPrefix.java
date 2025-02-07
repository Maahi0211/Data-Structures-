package expressions;
import static expressions.InfixToPostfix.infixToPostfix;

public class InfixToPrefix {

    public static String                                                                                                                                   infixToPrefix(String infix){
        StringBuilder reverseInfix=new StringBuilder(infix).reverse();
        for(int i=0; i<reverseInfix.length(); i++){
            if(reverseInfix.charAt(i)=='('){
                reverseInfix.setCharAt(i, ')');
            }
            else if(reverseInfix.charAt(i)==')'){
                reverseInfix.setCharAt(i, '(');
            }
        }
        String reversePostfix=infixToPostfix(reverseInfix.toString());
        return new StringBuilder(reversePostfix).reverse().toString();
    }

    public static void main(String[] args) {
        String infix="(A+B)*C-(D/E^F)*G";
        String prefix=infixToPrefix(infix);
        System.out.println("Prefix: "+prefix);
    }
}
