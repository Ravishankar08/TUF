
public class SecondLargestInArray {
    public static void main(String[] args) {
        System.out.println("The second largest Number in array is "+secondLargestElementInArray(new int[]{1,1,1,1,1}));
        System.out.println("The second largest Number in array is "+secondLargestElementInArray(new int[]{1,1}));
        System.out.println("The second largest Number in array is "+secondLargestElementInArray(new int[]{2,3,1,9,322}));
        System.out.println("-----------------");
        System.out.println("The second Smallest Number in array is "+secondSmallestElementInArray(new int[]{1,1,1,1,1}));
        System.out.println("The second Smallest Number in array is "+secondSmallestElementInArray(new int[]{1,1}));
        System.out.println("The second Smallest Number in array is "+secondSmallestElementInArray(new int[]{2,3,1,9,322}));
        System.out.println("-----------------");
    }

    private static int secondLargestElementInArray(int[] nums) {
        LargestElementInArray.printArray(nums);
        int largest = nums[0];
        int secondLargest = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > secondLargest && nums[i] != largest)
            {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    private static int secondSmallestElementInArray(int [] a){
        LargestElementInArray.printArray(a);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i]< secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            return -1;
        }
        return secondSmallest;
    }
}
