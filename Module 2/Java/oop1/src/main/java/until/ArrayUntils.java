package until;

public class ArrayUntils {
    public static int[] createArray(int size, int max, int min){
        int[] arr = new int[size];
        for(int i = 1;i<arr.length;i++){
            arr[i] = (int)Math.floor(Math.random()*(max - min + 1) + min);
        }
        return arr;
    }
}
