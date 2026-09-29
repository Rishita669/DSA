import java.util.*;
public class ConditionalStatementsP {
    public static void main(String[] args){
        // Print the largest of 2
        int A = 1, B = 3;
        if(A>=B){
            System.out.println("A is greater than or equal to B");
        }
        else{
            System.out.println("B is greater than A");
        }
        // Print the largest of 3
        int a = 1, b = 3, c = 6;
        if(a>=b && a>=c){
            System.out.println("A is greater than B and C");
        }
        else if(b>=c){
            System.out.println("B is greater than A and C");
        }
        else{
            System.out.println("C is geater than A and B");
        }
        // Print if a number is odd or even 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        // Income Tax Calculator
        float income, tax;
        System.out.println("Enter your income: ");
        income = sc.nextFloat();
        if(income<=500000){
            tax = 0;
            System.out.println("Your tax is: "+ tax);
        }
        else if(income>=500000 && income<1000000){
            tax = income * (0.2f);
            System.out.println("Your tax is: "+ tax);
        }
        else{
            tax = income * (0.3f);
            System.out.println("Your tax is: "+ tax);
        }
        


        

    }
}
