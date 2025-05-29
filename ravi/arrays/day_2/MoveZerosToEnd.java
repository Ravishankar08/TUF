import javax.management.loading.ClassLoaderRepository;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        System.out.println("Move all zeros to end");
        moveZerosToEnd(new int[]{0,1,2,3,0,1,2,3,0,2,0,0,0,10,10});
    }

    private static void moveZerosToEnd(int[] nums) {
        int updated = 0;
        int n = nums.length;
        LargestElementInArray.printArray(nums);
        for (int i=0;i<n;i++){
            if (nums[i] != 0){
                nums[updated] = nums[i];
                updated++;
            }
        }
        for (int i=updated;i<n;i++){
            nums[i] = 0;
        }

        LargestElementInArray.printArray(nums);
    }
}
