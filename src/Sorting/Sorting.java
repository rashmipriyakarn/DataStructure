package Sorting;

public class Sorting {
     int  Sort(int[] Arr1) {
        //int[] Arr1 = new int[6];
        int min = 30;
        for (int i = 2; i < Arr1.length; i++) {
            if (min < Arr1[i]) {
                Arr1[i] = Arr1[i+1];
                Arr1[i + 1] = min;
            }
        }
        return 1;
     }
        public static void main(String[] args){
            Sorting s1 = new Sorting();
            int[] Array = {30, 20,5, 10, 40, 50};
            s1.Sort(Array);
            System.out.println(Array);
        }
    }
