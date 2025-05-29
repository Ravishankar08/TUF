public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Maximum Consecutive Ones in Array");
        System.out.println(maximumOnes(new int[] {1,0,0,1,1,1,1,0,1}));
    }

    private static int maximumOnes(int[] a) {
        int n = a.length;
        LargestElementInArray.printArray(a);
        int ones = 0;
        int count =0;
        for (int i=0;i<n;i++){
            if (a[i] == 1){
                count ++;
                if (ones < count){
                    ones = count;
                }
            }
            else {
                count = 0;
            }
        }
        return ones;
    }
}
