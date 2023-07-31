import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for(int i = 0 ; i<arr.length; i++){
            System.out.printf("Nhập phần tử thứ %s: ", i);
            arr[i] = input.nextInt();
        }
        reverseArray(arr);
        System.out.print("Mảng sau khi được đảo ngược: ");
        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}