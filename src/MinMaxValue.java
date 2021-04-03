import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        int n, i = 1, num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("Enter how many number user wants to enter : ");
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();


        for (i = 1; i <= n; i++) {
            System.out.println("enter" + i + "number");
            num = s1.nextInt();
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("max is:" + max);
        System.out.println("min is:" + min);


            /*if(max<num){
                max=num;
            }
            System.out.println("maximum number is :" +max);
        }


            System.out.println("minimum number is :" +min);
        } */
    }
}
