

public class LargestElementInArray {
    public static void main(String[] args) {
        int largestNumber = largestElement(new int[]{12, 3, 4, 9, 8, 6});
    }

    public static int largestElement(int[] nums) {
        selectionSort(nums.clone());
        bubbleSort(nums.clone());
        insertionSort(nums.clone());

        //heap sort --> tree structure
        //quick sort  -> pivot element
        //merge sort
        //bucket sort

        if(nums.length >0){
            int largestElement = nums[0];
            for (int i =0;i< nums.length;i++){
                if(largestElement<nums[i]){
                    largestElement = nums[i];
                }
            }
            System.out.println( "largest element is "+largestElement);
            return largestElement;
        }
        return 0;
    }

    private static void insertionSort(int[] a) {
        int n = a.length;
        System.out.println("Insertion Sort");

        for(int i = 1; i < n; ++i) {
            int j = i - 1;

            int key;
            for(key = a[i]; j >= 0 && key < a[j]; --j) {
                a[j + 1] = a[j];
            }

            a[j + 1] = key;
        }

        printArray(a);
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        System.out.println("Bubble Sort");

        for(int i = 0; i < n - 1; ++i) {
            for(int j = i; j < n - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        printArray(nums);
    }

    private static void selectionSort(int[] nums) {
        int n = nums.length;
        System.out.println("Selection Sort");

        for(int i = 0; i < n - 1; ++i) {
            int small = i;

            for(int j = i + 1; j < n; ++j) {
                if (nums[j] < nums[small]) {
                    small = j;
                }

                int temp = nums[i];
                nums[i] = nums[small];
                nums[small] = temp;
            }
        }

        printArray(nums);
    }

    static void printArray(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
