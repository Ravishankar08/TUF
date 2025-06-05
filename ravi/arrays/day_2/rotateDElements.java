public class rotateDElements {
    public static void main(String[] args) {
        System.out.println("Rotating D elements to left");
        rotateDElementsArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        rotateDElementsArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1);
        rotateDElementsArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        rotateDElementsArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);


        System.out.println("Optimal Solution");
        rotateDElementsArray2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        rotateDElementsArray2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1);
        rotateDElementsArray2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        rotateDElementsArray2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
    }
    private static void rotateDElementsArray2(int[] a, int k) {
        System.out.println("Rotating "+k+" elements to left");
        LargestElementInArray.printArray(a);
        int n = a.length;
        rotate(a,0,k-1);
        rotate(a,k,n-1);
        rotate(a,0,n-1);
        LargestElementInArray.printArray(a);
        System.out.println("====================");

    }
    public static void rotate(int[] a, int start, int end){
       while(start<end){
           int temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;end--;
       }
    }

    private static void rotateDElementsArray(int[] a,int k) {
        System.out.println("Rotating "+k+" elements to left");
        LargestElementInArray.printArray(a);
        int n = a.length;
        int temp[] = new int[k];
        for (int i = 0; i<k;i++){
            temp[i] = a[i];
        }
        for (int i=0;i<n-k;i++){
            a[i] = a[k+i];
        }
        for (int i =0;i<k;i++){
            a[n-k+i] = temp[i];
        }
        LargestElementInArray.printArray(a);
        System.out.println("====================");
    }
}