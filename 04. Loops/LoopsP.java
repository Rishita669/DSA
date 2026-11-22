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
        // Keep entering numbers until user enters a multiple of 10
        do{
            System.out.println("Enter you number n: "); 
            int input = sc.nextInt();
            if(input%10==0){
                System.out.println("You entered a multiple of 10: "+input);
                break;
            }
            System.out.println(input);
        } while(true);
        // Display all numbers enters by user except multiple of 10  
        do {
            System.out.print("Enter the number (-1 to stop): ");
             int numberInput = sc.nextInt();
            if (numberInput == -1) {
            break;
            }
            if (numberInput % 10 == 0) {
            continue;
            }
        System.out.println(numberInput);
        } while (true);
        // Check if a number is primt or not
        System.out.println("Enter the number to check whether it is prime or not: ");
        int primeNum = sc.nextInt();
        boolean isPrime = true;
        if(primeNum==2){
            System.out.println("The number is prime");
        }
        else{
        for(int p=2; p<=Math.sqrt(primeNum); p++){
            if(primeNum%p==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
       }
    }
}

