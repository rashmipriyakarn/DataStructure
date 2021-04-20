public class InsertionSort {
    void Insertion(int[] Arr){
          int i=1, j=0, temp;
          //int temp= Arr1[i];
          for( i=1; i<Arr.length; i++){
          temp = Arr[i];
          j = i-1 ;
          while( j>=0 && temp<= Arr[j]){
              Arr[j+1] = Arr[j];
              j--;
          }
             Arr[j+1] = temp;
          }
    }
    public static void main(String[] args) {
        InsertionSort is1= new InsertionSort();
        int[] Array={4,5,3,2,1,0};
        for( int i: Array )
            System.out.print(" "+i);
        is1.Insertion(Array);
        System.out.println();
        for( int i: Array )
        System.out.print(" "+i);

    }
}
