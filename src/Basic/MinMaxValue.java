package Basic;

import java.util.Scanner;
/*Incase of finding max value among a set of numbers we will be taking max =Integer.MIN_VALUE
Integer.Min_VALUE is defined in object class and its value is -infinity and vice-versa.
 */

public class MinMaxValue {
    public static void main(String[] args) {
        int n, i = 1, num;
        int max = Integer.MIN_VALUE; //see top comments for better understanding
        int min = Integer.MAX_VALUE; // see top comments
        System.out.println("Enter how many number user wants to enter : ");
        Scanner s1 = new Scanner(System.in); //object creation in case of user input
        n = s1.nextInt(); //storing value of n, similar to scanf in C


        for (i = 1; i <= n; i++) {
            System.out.println("enter" + i + "number");
            num = s1.nextInt();//the complete for loop means: it asks for value one by one
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("max is:" + max);//if we write sout statement inside for loop it will/
        // iterate for all values and print max every time
        System.out.println("min is:" + min);
    }
}
