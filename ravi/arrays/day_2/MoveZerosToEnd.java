import javax.management.loading.ClassLoaderRepository;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        System.out.println("Move all zeros to end");
        moveZerosToEnd(new int[]{0,1,2,3,0,1,2,3,0,2,0,0,0,10,10});
    }

    private static void moveZerosToEnd(int[] a) {
        int updated = 0;
        int n = a.length;
        LargestElementInArray.printArray(a);
        for (int i=0;i<n;i++){
            if (a[i] != 0){
                a[updated] = a[i];
                updated++;
            }
        }
        for (int i=updated;i<n;i++){
            a[i] = 0;
        }

        LargestElementInArray.printArray(a);
    }
}
