import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        int n;
        int num;
        Scanner s1 = new Scanner(System.in);
        //n => how many numbers
        System.out.println("Enter Number");
        n = s1.nextInt(); //this is similar to scanf in c , here n is initialized
        System.out.println("user enter: " + n);
        for(int i =1; i<=n;i++){
            // numbers
            System.out.println("Enter " + i + " number: ");
            num = s1.nextInt();
            System.out.println("user enter: " + num);
        }
        System.out.println(n);
    }
}
