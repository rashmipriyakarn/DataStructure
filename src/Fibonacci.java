import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, i=2, c;
        System.out.println("Please enter any number");
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        System.out.println("User entered:" +num);
        System.out.println(a);
        System.out.println(b);
        while(i<=num) {
            c = (a + b);
            a = b;
            b = c;
            i++;
            System.out.println(c);
        }

        }
    }

