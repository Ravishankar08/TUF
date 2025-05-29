public class IsSorted {
    public static void main(String[] args) {
        System.out.println("returns "+isSorted(new int[]{9,2,1,46,7,2}));
        System.out.println("returns "+isSorted(new int[]{6,6,18,29}));
    }
    static boolean isSorted(int a[]){
        printArray(a);
        System.out.println(" is sorted ascending");
        Boolean isPositive = null;
        for (int i = 0;i<a.length-1;i++){
           if((a[i+1] - a[i])<0) {
               return false;
           }
        }
        return true;
    }
    static void printArray(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
