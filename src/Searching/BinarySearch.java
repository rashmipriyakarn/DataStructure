package Searching;//Binary Search

public class BinarySearch {
        public  int Search(int[] Arr1, int num) {
            int start = 0, end = Arr1.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (Arr1[mid] == num) {
                    return mid;
                } else if (num < Arr1[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return -1;
        }
        public static void main(String[] args) {
        BinarySearch bs1= new BinarySearch();
        int[] Array={10,20,30,40,50,60};
        int Index = bs1.Search(Array, 70);
            System.out.println(Index);
    }
}
