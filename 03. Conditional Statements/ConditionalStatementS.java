import java.util.*;
public class ConditionalStatementS {
    public static void main(String[] args){
        // Calculator
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        System.out.println("Enter the value of b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation to be performed: ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("The sum of a and b is: "+(a+b));
                break;
            case '-':
                System.out.println("The difference of a and b is: "+(a-b));
                break;
            case '*':
                System.out.println("The product of a and b is:"+ (a*b));
                break;
            case '/':
                System.out.println("The quotient of a and b is: "+ (a/b));
                break;
            case '%':
                System.out.println("The remainder of a and b is: "+(a%b));
                break;
            default:
                System.out.println("Enter a valid operator");
            }
    }
}