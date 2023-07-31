import java.util.Scanner;

public class FindMinium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {23,43,65,56,234,4,534};
        int index = minValue(arr);
        System.out.println("Min Value of Array arr is: " + arr[index]);
    }
    public static int minValue(int[] arr){
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }
}
