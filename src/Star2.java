/*
 **
 ***
 ****
 *****
 */

import java.util.Scanner;
public class Star2 {
    public static void main(String[] args) {
        int n;

        Scanner s1= new Scanner(System.in);
        System.out.println(" Enter the value of n :");
        n=s1.nextInt();

        for(int j=1; j<=n; j++){
            for(int i=1; i<=j; i++) {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    }

