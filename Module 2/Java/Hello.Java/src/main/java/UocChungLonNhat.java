import java.sql.SQLOutput;
import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhập a = ");
        int a = nhap.nextInt();
        System.out.println("Nhập b = ");
        int b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if( a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất là: " + a);
    }
}
