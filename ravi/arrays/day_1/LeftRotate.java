public class LeftRotate {
    public static void main(String[] args) {
        System.out.println("left rotate");
        leftRotate(new int[]{2,1,4,3,7,9});
    }

    private static void leftRotate(int[] a) {
        LargestElementInArray.printArray(a);
        int firstPosition  = a[0];
        for (int i = 0 ;i<a.length-1;i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = firstPosition;
        LargestElementInArray.printArray(a);
    }
}
