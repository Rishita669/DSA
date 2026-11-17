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
         // Check whether a number is positive or negative
        int num;
        System.out.println("Enter the number to check whether it is positive or negative:  ");
        num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
        // Check whether the temperature is above 100
        double temperature;
        System.out.println("Enter the temperature: ");
        temperature = sc.nextDouble();
        if(temperature>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
        // Input week number and print the dat accordingly 
        int weeknumber;
        System.out.println("Enter the week number: ");
        weeknumber = sc.nextInt();
        switch(weeknumber){
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3: 
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("You entered the wrong number. Please enter the correct number between 1-7.");
        }
            // Year is leap year or not 
            int year;
            System.out.println("Enter the year to check whether it is leap ot not: ");
            year = sc.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("The year is a leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
        

    }
}