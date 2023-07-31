import java.util.Scanner;

public class CheckPrime {
    public static Scanner nhap = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Nhập 1 số: ");
    int number = nhap.nextInt();
    boolean flag = true;
    for(int i = 2; i < number; i++){
        if(number < 2){
            flag = false;
            System.out.println(number + " không phải là số nguyên tố");
            break;
        }
        if(number % i == 0){
            flag = false;
            System.out.println(number + " không phải là số nguyên tố");
            break;
        }

        }
    if(flag == true){
        System.out.println(number + " là số nguyên tố");
    }
    }
}
