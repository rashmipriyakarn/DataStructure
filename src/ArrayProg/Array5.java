package ArrayProg;

//copy elements of array to another array
public class Array5 {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};
        int[] a2 = new int[3];
        a2 = a1;
        a1[1] =  60;
        System.out.println(a2[1]);

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Elements of a1 array :" +a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.println("Elements of a2 array :" + a2[i]);

        }
    }
}