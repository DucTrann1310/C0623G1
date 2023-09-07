import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaiTapJava1 {
    public static void main(String[] args) {
        int[] array = {-11,1,-33,23,1,-11,56,-13,1,-33,-56,1,23,21,-32,45,-65,3};
        int[] arrayA = {-30,-15,-6,-1,2,6,9,12,30};
        //Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
//        sortIntegerAscending(array);
//        System.out.println(Arrays.toString(array));

        //Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
//        sortOddAscending(array);
//        System.out.println(Arrays.toString(array));

        //Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
//        sortIntegerAscendingNegativeIntegerDescending(array);
//        System.out.println(Arrays.toString(array));

        //Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
//        displayOdd(array);
//        System.out.println(Arrays.toString(displayOdd(array)));

        //Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
//        dissplayPositionPrime(array);
//        System.out.println(Arrays.toString(dissplayPositionPrime(array)));

        //Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng
//        count(array);
//        System.out.println(count(array));

        //Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
//        checkZero(array);
//        System.out.println(checkZero(array));

        //Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
//        System.out.println(Arrays.toString(addElement(array)));

        //Bài 11: Thêm x vào trong mảng tăng nhưng vẫn giữ nguyên tính tăng của mảng
//        System.out.println(Arrays.toString(addElementKeepArrayAscending(arrayA)));

        //Bài 12: Xóa tất cả các số âm trong mảng
//        System.out.println(Arrays.toString(deleteNegativeInteger(array)));

        //Bài 13: Xóa tất cả các số chẵn trong mảng
//        System.out.println(Arrays.toString(deleteEven(array)));

        //Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
//        System.out.println(Arrays.toString(deleteDuplicate(array)));

        //Bài 15: Hãy đưa tất cả các số 1 về đầu mảng
        System.out.println(Arrays.toString(return1ToFront(array)));
    }
    public static void  sortIntegerAscending(int[]arr){
        int k = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > 0){
                k = i;
                for(int j=k+1; j< arr.length;j++){
                    if(arr[i] > arr[j] && arr[j] > 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public static void  sortOddAscending(int[]arr){
        int k = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] % 2 != 0){
                k = i;
                for(int j=k+1; j< arr.length;j++){
                    if(arr[i] > arr[j] && arr[j] %2 != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public static void  sortIntegerAscendingNegativeIntegerDescending(int[]arr){
        int k = 0;
        int h = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > 0){
                k = i;
                for(int j=k+1; j< arr.length;j++){
                    if(arr[i] > arr[j] && arr[j] > 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            if(arr[i] < 0){
                h = i;
                for(int j=h+1; j< arr.length;j++){
                    if(arr[i] < arr[j] && arr[j] < 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public static int[]  displayOdd(int[]arr){
        int[] newArray = new int[arr.length -1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            boolean check = true;

            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    check = false;
                    break;
                }
                number /= 10;
            }

            if (check) {
                newArray[k] = arr[i];
                k++;
            }
        }
        newArray = Arrays.copyOf(newArray,k);
        return newArray;
    }
    public static int[]  dissplayPositionPrime(int[]arr){
        int[] newArray = new int[arr.length];
        int k = 0;
       for(int i=0;i<arr.length;i++){
           boolean check = true;
           if(arr[i]<2){
               check = false;
               continue;
           }
           if(arr[i] == 2){
               check = true;
               newArray[k] = i;
               k++;
               continue;
           }
           for(int a = 2;a < arr[i];a++){
               if(arr[i] % a == 0){
                   check = false;
                   break;
               }
           }
           if(check){
               newArray[k] = i;
               k++;
           }
       }
        newArray = Arrays.copyOf(newArray,k);
        return newArray;
    }
    public static int count(int[]arr){
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(Math.abs(arr[i] % 10) == 5){
                count++;
            }
        }
        return  count;
    }
    public static int checkZero(int[]arr){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 0 ){
                return 1;
            }
        }
        return 0;
    }
    public static int[] addElement(int[]arr){
        int[] newArray = new int[arr.length];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị x muốn thêm vào: ");
        int x = input.nextInt();
        System.out.println("Nhập vị trí k muốn th4êm vào: ");
        int k = input.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(j == k){
                newArray[j] = x;
                j++;
            }else {
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
    }
    public static int[] addElementKeepArrayAscending(int[]arr){
        int[] newArray = new int[arr.length + 1];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị x muốn thêm vào: ");
        int x = input.nextInt();
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<x){
                newArray[j] = arr[i];
                j++;
            }else{
                newArray[j] = x;
                j++;
                break;
            }
        }
        for(int i = j-1;i<arr.length;i++){
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }
    public static int[] deleteNegativeInteger(int[]arr){
        int count = 0;
        int j = 0;
        int[] newArray = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>0){
                newArray[j] = arr[i];
                count++;
                j++;
            }
        }
        return Arrays.copyOf(newArray,count);
    }
    public static int[] deleteEven(int[]arr){
        int count = 0;
        int j = 0;
        int[] newArray = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] % 2 != 0){
                newArray[j] = arr[i];
                count++;
                j++;
            }
        }
        return Arrays.copyOf(newArray,count);
    }
    public static int[] deleteDuplicate(int[] arr) {
        if(arr.length < 1){
            return arr;
        }
        int[] newArray = new int[arr.length];
        int k = 1;
        newArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[k] = arr[i];
                k++;
            }
        }
        return Arrays.copyOf(newArray,k);
    }
    public static int[] return1ToFront(int[]arr){
        int[] newArray = new int[arr.length];
        int k = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                newArray[k] = arr[i];
                k++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 1){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }
}
