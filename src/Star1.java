import java.util.Scanner;

/*  ******
    ******
    ******
 */
public class Star1 {
    public static void main(String[] args) {
        int n,i;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        n= s1.nextInt();

      for(  i=1; i<=n; i++) {
          for(int j=1; j<=n; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
