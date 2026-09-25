import java.util.*;
public class ArithmeticOperators {
    public static void main(String[] args){
        // Binary Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition= "+(a+b));
        System.out.println("Subtraction= "+(a-b));
        System.out.println("Multiply= "+(a*b));
        System.out.println("Divide= "+(a/b));
        System.out.println("Modulo= " +(a%b));
        // Unary Operators Increment 
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println("Pre increment=" + d);
        int e = c++;
        System.out.println(c);
        System.out.println("Post increment= "+ e);
        // Unary Operator Decremnent 
        int f = 11;
        int g = --f;
        System.out.println(f);
        System.out.println("Pre decrement= "+ g);
        int h = f--;
        System.out.println(f);
        System.out.println("Post decrement= "+h);
    }
}
