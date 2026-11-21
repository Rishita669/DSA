import java.util.*;
public class LoopsP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print numbers from 1 to 100 using while loop
        int num =1;
        while(num<=5){
            System.out.println(num);
            num++;
        }
        // Print number from 1 to n
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        //Sum of first n natural numbers
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum =0;
        int j=1;
        while(j<=number){
            sum+=j;
            j++;
        }
        System.out.println("Sum of first n natural numbers is:"+sum);
        //Print reverse of a number
        System.out.print("Enter the number to reverse: ");
        int revNum = sc.nextInt();
        for(int k=revNum; k>0; k/=10){
            int digit = k%10;
            System.out.print(digit);
        }
        }
    }

