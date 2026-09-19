import java.util.Scanner;
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // Average of N numbers is sum of those numbers divided by N
        System.out.println("Enter the first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number c: ");
        int c = sc.nextInt();
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("The average of three numbers is: " + average);
        // to find area of square
        System.out.println("Enter the side of a square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area of the square is: " + area);
        // Total cost of the items in the user bill 
        System.out.println("Enter the cost of a pencil: ");
        float pencilcost = sc.nextFloat();
        System.out.println("Enter the cost of a a pen: ");
        float pencost = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float erasercost = sc.nextFloat();
        float totalcost = pencilcost + pencost + erasercost;
        System.out.println("The total cost of all the items are: " + totalcost);
        
    }
}