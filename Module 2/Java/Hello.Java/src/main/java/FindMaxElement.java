import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i =0; i<arr.length;i++){
            System.out.printf("Nhập phần tử thứ %s: ", i+1);
            arr[i] = input.nextInt();
        }
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("giá trị lớn nhất trong mà là " + max);
    }
}
