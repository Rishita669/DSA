import java.util.*;
public class PatternsP{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Star Pattern 
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Inverted Star Pattern
        int n;
        n = sc.nextInt();
        for(int p=1; p<=n; p++){
            for(int q=1; q<=(n-p+1); q++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Half-Pyramid Number Pattern
        int m;
        m= sc.nextInt();
        for(int a=1; a<=m; a++){
           for(int b=1; b<=a; b++){
              System.out.print(b);
           }
           System.out.println();
        }
        // Print Character Pattern
        int c;
        c = sc.nextInt();
        char ch = 'A';
        for(int line=1; line<=c; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    // Number Pyramid pattern
    int num;
    num = sc.nextInt();
    for(int x=1; x<=num; x++){
        for(int y=1; y<=num-x; y++){
            System.out.print(" ");
        }
        for(int y=1; y<=x; y++){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    }

}