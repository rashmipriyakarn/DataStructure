package ArrayProg;

//Compute Sum and Average of Array Elements
public class Array4 {
    public static void main(String[] args) {
        int[] num={10,6,8,18,30,36,52};
        int sum=0;
        float avg;

        for(int i=0; i<num.length; i++ ){
            sum=sum+num[i];}
            System.out.println("Sum is :" +sum);

        avg=sum/num.length;
        System.out.println("Average is :" +avg);

    }
    }

