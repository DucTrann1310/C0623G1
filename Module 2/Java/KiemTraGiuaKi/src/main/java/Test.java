import java.util.Arrays;

public class Test {
    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] removePrimesFromArray(int[] arr){
        int[] newArray = new int[arr.length];
        int count = 0;
        for(int i =0;i<arr.length;i++){
                if(!isPrime(arr[i])){
                    newArray[count++] = arr[i];
                }
        }
        newArray = Arrays.copyOf(newArray,count);
        return  newArray;
    }
    public static int[] movePrimesToFront(int[] arr) {
        int[] newArray = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                newArray[count++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                newArray[count++] = arr[i];
            }
        }
        newArray = Arrays.copyOf(newArray, count);
        return newArray;
    }
    public static int[] deleteIndex(int[] arr, int index){
        for(int i = index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,7,9,11,12,13,17};
        System.out.println(Arrays.toString(removePrimesFromArray(arr1)));
        System.out.println(Arrays.toString(movePrimesToFront(arr1)));
        System.out.println(Arrays.toString(deleteIndex(arr1,2)));
    }
}
