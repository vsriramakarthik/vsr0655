public class ArraySum {
        public static void main(String args[]) {
            int[] a = { 1, 2, 44, 5, 6 };
            System.out.println("the sum of array elements :" + Sum(a));
            System.out.println("Average of elements in array" + (Sum(a) / a.length));
            System.out.println("the median of array elements :" + a[a.length / 2]);
            //sorting of arrays
            int temp = 0;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < (a.length) - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("the minimum elements  of array :" + a[0]);
            System.out.println("the 2nd minimum elements  of array :" + a[1]);
            System.out.println("the maximum elements  of array :" + a[a.length - 1]);
            System.out.println("the 2nd maximum elements  of array :" + a[a.length - 2]);
        }
    
        public static int Sum(int[] a) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            return sum;
        }
    
}
