package StarProg;/*
 *
 **
 ***
 ****
 *****
 */

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        int n;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        n=s1.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
