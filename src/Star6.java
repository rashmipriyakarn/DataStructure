import java.util.Scanner;

public class Star6 {
    public static void main(String[] args) {
            int n;
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter the value of n: ");
            n=s1.nextInt();

            for(int i=1; i<=n; i++)
            {
                for(int j=n -1; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



