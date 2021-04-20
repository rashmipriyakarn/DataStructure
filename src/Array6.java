// Delete an element from an Array
public class Array6 {
    public static void main(String[] args) {
        int[] num1={10,20,30};
        int[] num2= new int[2];

        num2=num1;
         for(int i=0; i<num1.length; i++){
             System.out.println("num1 elements:" +num1[i]); }
        System.out.println();

         for(int i=0; i<num2.length-1; i++){
             System.out.println("num2 elements:" +num2[i]);

         }

    }
}
