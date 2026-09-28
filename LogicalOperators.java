import java.util.*;
public class LogicalOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 16;
        //Logical AND [&&]
        System.out.println((a<b)&&(a>b));
        //Logical OR [||]
        System.out.println((a>b)||(a<b));
        //Logical NOT [!]
        System.out.println(!(a<b));
    }
}
