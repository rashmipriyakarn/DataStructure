package ArrayProg;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
       // System.out.println("enter the elements:-");
        int n=s1.nextInt();

        int[] Arr1= new  int[n];
        for(int i=0; i<n; i++) {
            Arr1[i] = s1.nextInt();
            System.out.println("Entered elements for Arr1[i] :"+Arr1[i]);
        }
        int[] Arr2= new int[n-1];
        System.out.println("Enter Index :");
        int index=s1.nextInt();

        for(int i=0; i<n-1; i++){
            if(i<index) {
                Arr2[i] = Arr1[i];
            }
            else{
                Arr2[i]= Arr1[i+1];
            }
        }
        for(int i=0; i<n-1; i++) {
            System.out.print(Arr2[i]+" ");
        }
    }
}


