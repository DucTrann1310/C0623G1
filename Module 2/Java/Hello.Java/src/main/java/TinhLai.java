import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhập tiền gửi: ");
        int tiengui = nhap.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất theo tháng: ");
        double laisuattheothang = nhap.nextDouble();
        System.out.println("Nhập số tháng cho vay: ");
        int sothangchovay = nhap.nextInt();
        double total = 0;
        for(int i = 0; i < sothangchovay; i++){
            total += tiengui*(laisuattheothang/100)/12 *sothangchovay;
        }
        System.out.println("Số tiền lãi: " + total);
    }
}
