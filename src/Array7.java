// Delete an element from an Array
import java.util.Scanner;

// Delete an element from an Array
public class Array7 {
    public static void main(String[] args) {
        int n,i,d;

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the numbers you want to store:");
        n=s1.nextInt();

        int[] a1=new int[5];
        System.out.println("Enter the elements :");
        //System.out.println("Enter the index which needs to get deleted" +d);

        for( i=0; i<n-1; i++){
           // if(!i==d)
            a1[i]=s1.nextInt();}
            System.out.println("Entered elements for array a1 are" +a1[i]);

        }
    }

