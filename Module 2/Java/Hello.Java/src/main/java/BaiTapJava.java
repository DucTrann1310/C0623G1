import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaiTapJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrA = new int[10];
        for(int i = 0;i<arrA.length;i++){
            System.out.printf("Nhập phần tử thứ %s: ", i+1);
            arrA[i] = input.nextInt();
        }


//        Bài 1: tìm giá trị lớn nhất của mảng
//        findMax(arrA);

//        Bài 2: tìm giá trị lớn thứ 2 trong mảng
//        findMax2(arrA);

//        Bài 3: Tính tổng 3 giá trị lẻ đầu tiên
//        totalOf3Odd(arrA);

//        Bài 4: Đảo ngược mảng
//        reverseArray(arrA);
//        displayreverseArray(arrA);

//        Bài 5: nối mảng b vào mảng a
//        int[] arrB = {34,46,57,34,23};
//        connectArrayAWithArrayB(arrA,arrB);

//        Bài 6: tính tổng các số nguyên tố trong mảng
//        totalPrime(arrA);

//        Bài 7: tính trung bình các số chính phương trong mảng
//        averageSquareNumber(arrA);





//        int[][] arrI = {
//                {1,3,5,7,9},
//                {2,4,6,8,10},
//                {12,35,21,48,34},
//                {345,45,27,35,12}
//        };
//        Bài 8: hiển thị các cột chẵn
//        displayColumnEven(arrI);

//        Bài 9: Tính tổng các giá trị đường viền
//        totalBorder(arrI);

//        Bài 10: Tìm ra vị trí [i,j] của số chẳn đầu tiên
//        findFistEven(arrI);

//        Bài 11: Tính tổng các số nguyên tố trong mảng 2 chiều
//        totalPrime2(arrI);

//        Bài 12: Tính tổng: tam giác trên trái, trên phải, dưới trái, dưới phải
//        totalTriangleAboveLeft(arrI);
//        totalTriangleAboveRight(arrI);
//        totalTriangleBelowLeft(arrI);
//        totalTriangleBelowRight(arrI);



//            int[] arrA = {-23,34,3,54,6,-43,-213,46,-346,234,25,-324,-12};
//            int[] arrB = {23,34,56,345,24,34,345,453,456,456,45,24,23,23,23};

//        Bài 1: Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
//        totalBigger(arrA);

//        Bai 2 Tính trung bình cộng các số dương trong mảng 1 chiều các số thực
//        totalInteger(arrA);

//        Bài 3: Đưa các số chia hết cho 3 về đầu mảng
//        displayNumberDivisible3(arrA);

//        Bài 4: Đảo ngược mảng ban đầu
//            reverseArray(arrA);

//        Bài 5: Hãy liệt kê các số trong mảng 1 chiều các số thực thuộc đoạn [x, y] cho trước
//        displayNumberKnown(arrA);

//        Bài 6: Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó
//            displayNumberAbs(arrA);

//        Bài 7: Hãy liệt kê các vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên
//        findPerfectSquare(arrA);

//        Bài 8: Đếm số dương chia hết cho 7 trong mảng
//        countNumberDivisible7(arrA);

//        Bài 9: Đếm số nguyên tố trong mảng
//            countPrime(arrA);

//        Bài 10: Hãy xác định số lượng phần tử kề nhau mà cả 2 đều chẵn
//        countEvenNear(arrA);

//        Bài 11: Kiểm tra mảng có đối xứng không? Có trả về 1, không có trả về 0
//        checkReverse(arrA);

//        Bài 12: Kiểm tra mảng có tăng dần hay không
//        checkAscending(arrA);

//        Bài 13: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
//        check2Array(arrA,arrB);




//        int[][] arrI = {
//                {1,3,-5,7,9},
//                {2,4,6,-8,10},
//                {12,-35,21,48,34},
//                {345,45,27,21,12}
//        };
//        Bài 14: Kiểm tra ma trận 2 chiều có toàn dương hay không
//            checkInteger(arrI);

//        Bài 15: Kiểm tra một cột ma trận có giảm dần hay không
//        checkColumnDescending(arrI);

//        Bài 16: Kiểm tra ma trận có tồn tại số lẻ hay không
//        checkOdd(arrI);

//        Bài 17: Liệt kê các dòng giảm dần trong ma trận
//        displayRowDescending(arrI);

//        Bài 18: Tìm số chẵn đầu tiên trong ma trận
//        findFirstEven(arrI);

//        Bài 19: Tìm số chẵn lớn nhất trong ma trận
//        findMaxEven(arrI);

//        Bài 20: Liệt kê các dòng có tổng lớn nhất
//        displayRowMaxTotal(arrI);
    }
    public static void  findMax(int[]arr){
        String str = "[";
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(i == arr.length - 1){
                str +=arr[i] + "]";
            }else{
                str += arr[i] + ",";
            }
        }
        System.out.println("Mảng vừa nhập là: " + str);
        System.out.println("giá trị lớn nhất trong mảng là: " + max);
    }
    public static void findMax2(int[]arr){
        String str = "[";
        for(int i=0;i<arr.length;i++){
            if(i == arr.length - 1){
                str +=arr[i] + "]";
            }else{
                str += arr[i] + ",";
            }
        }
        System.out.println("Mảng vừa nhập là: " + str);
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max2 = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] != max2){
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println("Không có giá trị lớn thứ 2");
        }
        System.out.println("giá trị lớn thứ 2 là: " + max2);
    }
    public static void  totalOf3Odd(int[]arr){
        int count = 0;
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            if(count<3){
                if(arr[i] % 2 != 0){
                    count ++;
                    total += arr[i];
                }
            }
        }
        System.out.println("Tổng 3 số lẻ đầu tiên là: " + total);
    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void  displayreverseArray(int[]arr){
        String reverseStr = "[";
        for(int i =0;i<arr.length;i++){
            if(i == arr.length - 1){
                reverseStr += arr[i] + "]";
            }else {
                reverseStr += arr[i] + ",";
            }
        }
        System.out.println("Mảng sau khi đảo ngược là: " + reverseStr);
    }
    public static void  connectArrayAWithArrayB(int[]arr1,int[]arr2){
        int[] arrC = new int[arr1.length + arr2.length];
        String str = "[";
        for(int i =0; i<arr1.length;i++){
            arrC[i] = arr1[i];
        }
        for(int i =0;i<arr2.length;i++){
            arrC[arr1.length+i] = arr2[i];
        }
        for(int i = 0;i<arrC.length;i++){
            if(i == arrC.length-1){
                str += arrC[i] + "]";
            }else {
                str += arrC[i] + ",";
            }
        }
        System.out.println("Nối mảng a với mảng b thành: " + str);
    }
    public static void  totalPrime(int[]arr){
        boolean flag = true;
        int total = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]<2){
                flag = false;
            }
            if(arr[i] % i == 0){
                flag = false;
            }
            if(flag == true){
                total += arr[i];
            }
        }
        System.out.println("Tổng các số nguyên tố trong mảng là: " + arr);
    }
    public static boolean  checkSquareNumber(int a) {
        int b = (int)Math.sqrt(a);
        return b*b == a;
    }
    public static void  averageSquareNumber(int[]arr){
        int total = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(checkSquareNumber(arr[i])){
                total +=arr[i];
                count++;
            }
        }
        if(count == 0){
            System.out.println("Mảng không có số chính phương");
        }else{
            double average = (double) total/count;
            System.out.println("Trung bình các số chính phương trong mảng là: " + average);
        }
    }
    public static void displayColumnEven(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j % 2 == 0){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void totalBorder(int[][]arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1){
                    total +=arr[i][j];
                }
            }
        }
        System.out.println("Tổng các giá trị đường viền là: " + total);
    }
    public static void  findFistEven(int[][]arr){
        int a = -1;
        int b = -1;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j <arr[i].length;j++){
                if(arr[i][j] % 2 == 0){
                a = i;
                b = j;
                found = true;
                break;
                }
            }
            if(found){
                break;
            }
        }
        if(found){
            System.out.printf("Số chẵn đầu tiên nằm ở vị trí (%s,%s)", a, b);
        }else{
            System.out.println("Không tìm thấy số chẵn trong mảng");
        }
    }
    public static void totalPrime2(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                boolean flag = true;
                if (arr[i][j] < 2) {
                    flag = false;
                }
                for (int k = 2; k < arr[i][j]; k++) {
                    if (arr[i][j] % k == 0) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số nguyên tố trong mảng 2 chiều là: " + total);
    }
    public static void  totalTriangleAboveLeft(int[][]arr){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(i==0||j==0||i+j<arr.length){
                    total += arr[i][j];
                }
            }
        }
        System.out.println("Tổng tam giá trên trái là : " + total);
    }
    public static void  totalTriangleAboveRight(int[][]arr){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(i==0||j==arr[i].length-1||i==j||i<j){
                    total+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng tam giá trên phải là : " + total);
    }
    public static void  totalTriangleBelowLeft(int[][]arr){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(i==arr.length-1||j==0||i==j||i>j)
                    total+=arr[i][j];
            }
        }
        System.out.println("Tổng tam giá dưới trái là : " + total);
    }
    public static void  totalTriangleBelowRight(int[][]arr){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(i==arr.length-1||j==arr.length-1||i+j==arr.length-1||i+j==arr.length)
                    total+=arr[i][j];
            }
        }
        System.out.println("Tổng tam giá dưới phải là : " + total);
    }



    public static void  totalBigger(int[]arr){
        int total = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                total += arr[i];
            }
        }
        System.out.println("Tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực là: " + total);
    }
    public static void  totalInteger(int[]arr){
        int total=0;
        int count=0;
        double average;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                total+=arr[i];
                count+=1;
            }
        }
        average = (double)total/count;
        System.out.println("Trung bình cộng các số dương trong mảng 1 chiều các số thực là: " + average);
    }
    public static void  displayNumberDivisible3(int[]arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left<arr.length && arr[left] % 3 == 0){
                left++;
            }
            while (right >= 0 && arr[right] % 3 != 0) {
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println("Mảng sau khi chuyển các số chia hết cho 3 về đầu mảng: " + Arrays.toString(arr));
    }
    public static void displayNumberKnown(int[]arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        int x = input.nextInt();
        System.out.println("Nhập tọa độ y: ");
        int y = input.nextInt();
        String str = "[";
        for(int i = 0; i<arr.length;i++){
            if(x <= i && i < y){
                str += arr[i] + ",";
            }
            if(i == y){
                str += arr[i] + "]";
            }
        }
        System.out.printf("Các số thuộc đoạn [%s,%s] cho trước là: %s",x,y,str);
    }
    public static void  displayNumberAbs(int[]arr){
        for(int i = 0;i< arr.length - 1;i++){
            if(Math.abs(arr[i])>Math.abs(arr[i+1])){
                System.out.println(arr[i]);
            }
        }
    }
    public static void  findPerfectSquare(int[]arr){
        List<Integer> newArray = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(Math.sqrt(arr[i]) == (int)Math.sqrt(arr[i])){
                newArray.add(i);
            }
        }
        if(newArray.size() == 0){
            System.out.println("Không có số chính phương trong mảng");
        }else{
            System.out.println("Số chính phương nằm ở vị trí: ");
            for(int index : newArray){
                System.out.println(index);
            }
        }
    }
    public static void  countNumberDivisible7(int[]arr){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] > 0 && arr[i] % 7 == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có số dương chia hết cho 7");
        }else{
            System.out.println("Số số dương chia hết cho 7 là: " + count);
        }
    }
    public static void  countPrime(int[]arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            boolean check = true;
            if(arr[i]<2){
                check = false;
                continue;
            }
            for(int j = 2;j<arr[i];j++){
                if(arr[i] % j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        System.out.println("Số nguyên tố trong mảng là: " + count);
    }
    public static void  countEvenNear(int[]arr){
        int count = 0;
        for(int i = 0; i <arr.length -1;i++){
            if(arr[i] % 2 == 0  && arr[i+1] % 2 == 0){
                count++;
            }
        }
        System.out.println("Số lượng phần tử kề nhau mà cả 2 đều chẵn là: " + count);
    }
    public static void  checkReverse(int[]arr){
        boolean check = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != arr[arr.length-1-i]){
                System.out.println(0);
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(1);
        }
    }
    public static void  checkAscending(int[]arr){
        boolean check = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Mảng tăng dần");
        }else{
            System.out.println("Mảng không tăng dần");
        }
    }
    public static void  check2Array(int[]arr1,int[]arr2){
        boolean check;
        for(int i = 0; i<arr1.length;i++){
            check = false;
            for (int j = 0; j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("Mảng a không nằm trong mảng b");
                return;
            }
        }
        System.out.println("Mảng a nằm trong mảng b");
    }
    public static void  checkInteger(int[][]arr){
        boolean check = true;
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] < 0){
                    check = false;
                    break;
                }
                }
            if(check == false){
                break;
            }
        }
        if(check){
            System.out.println("Ma trận toàn dương");
        }else{
            System.out.println("Ma trận không toàn dương");
        }
    }
    public static void  checkColumnDescending(int[][]arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cột muốn kiểm tra: ");
        int a = input.nextInt();
        if(0 <=a && a <arr.length){
            for(int i = 0;i< arr.length - 1;i++){
                if(arr[i][a] > arr[i+1][a]){
                    System.out.printf("Cột %s của ma trận không giảm dần", a);
                    return;
                }
            }
            System.out.printf("Cột %s của ma trận giảm dần", a);
        }else if(a >= arr.length){
            System.out.printf("Ma trận không có cột %s",a);
        }
    }
    public static void checkOdd(int[][]arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j] % 2 != 0){
                    System.out.println("Ma trận tồn tại số lẻ");
                    return;
                }
            }
        }
        System.out.println("Ma trận không tồn tại số lẻ");
    }
    public static void  displayRowDescending(int[][]arr){
        for(int i = 0; i<arr.length;i++){
            boolean check = true;
            for(int j = 0; j<arr[i].length - 1;j++){
                if(arr[i][j]< arr[i][j+1]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.printf("Dòng %s: ",i);
                for(int j = 0; j<arr[i].length;j++){
                    System.out.printf("%s ",arr[i][j]);
                }
            }
        }
    }
    public static void  findFirstEven(int[][]arr){
        for(int i = 0;i< arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j] % 2 == 0){
                    System.out.printf("Số chẵn đầu tiên trong ma trận là số %s nằm ở vị trí (%s,%s)",arr[i][j],i,j);
                    return;
                }
            }
        }
        System.out.println("Ma trận không tồn tại số chẵn");
    }
    public static void findMaxEven(int[][]arr){
        int max = 0;
        int a = 0;
        int b = 0;
        for(int i = 0;i< arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j] % 2 == 0 && arr[i][j]>max){
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.printf("Số chẵn lớn nhất trong ma trận là số %s nằm ở vị trí (%s,%s)",max,a,b);
    }
    public static void  displayRowMaxTotal(int[][]arr){
        int[] total = totalRow(arr);
        int max = Integer.MIN_VALUE;
        List<Integer> newArray = new ArrayList<>();
        for(int i =0; i<total.length;i++){
            if(total[i] == max){
                newArray.add(i);
            }else if(total[i] > max){
                max = total[i];
                newArray.clear();
                newArray.add(i);
            }
        }
        System.out.println("Các dòng có tổng lớn nhất là: ");
        for(int i:newArray){
            System.out.printf("Dòng %s: %s",i, Arrays.toString(arr[i]));
        }
    }
    public static int[] totalRow(int[][]arr){
        int[] totalRow = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            totalRow[i] = sum;
        }
        return totalRow;
    }
}


