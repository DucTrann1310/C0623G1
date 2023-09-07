import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class introduceToJava {
    public static void main(String[] args) {
        //Hiển thị thời gian của hệ thống
//        displayTime();

        //Khai báo và sử dụng biến
//        useVariable();

        //Sử dụng toán tử
//        areaRectangle();

        //giải phương trình bậc nhất
//        firstDegreeEquation();

        //Tính số ngày trong tháng
//        datesOfMonth();

        //Kiểm tra năm nhuận
//        checkLeapYear();

        //Tính chỉ số cân nặng
//        calculatorBMI();
    }
    public static void displayTime(){
        Date now = new Date();
        System.out.println("Time is: " + now);
    }
    public static void useVariable(){
        int i = 10;
        float f = 20.5f;
        double d = 20.5d;
        boolean b = true;
        char c = 'a';
        String s = "Hà nội";
        System.out.println("Số nguyên: " + i);
        System.out.println("Số thực: " + f);
        System.out.println("Số thực lớn: " + d);
        System.out.println("Logic: " + b);
        System.out.println("Kí tự: " + c);
        System.out.println("Chuỗi: " + s);

    }
    public static void  areaRectangle(){
      Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int height = input.nextInt();
        System.out.println("Nhập chiều rộng:");
        int width = input.nextInt();
        int area = height*width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
    public static void firstDegreeEquation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = input.nextInt();
        System.out.println("Nhập b = ");
        int b = input.nextInt();
        System.out.printf("Phương trình bậc nhất %dx + %d = 0",a,b);
        System.out.println("");
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else if(b != 0){
                System.out.println("Phương trình vô nghiệm");
            }
        }else if( a != 0){
            float x = (float) -b/a;
            System.out.println("Phương trình có nghiêm x = " + x);
        }
    }
    public static void  datesOfMonth(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %s có 31 ngày",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %s có 30 ngày",month);
                break;
            case 2:
                System.out.printf("Tháng %s có 28 hoặc 29 ngày",month);
        }
    }
    public static void  checkLeapYear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = input.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d là năm nhuận");
        }else {
            System.out.printf("%d không là năm nhuận");
        }
    }
    public static void  calculatorBMI(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input height: ");
        float height = input.nextFloat();
        System.out.println("Input weight: ");
        float weight = input.nextFloat();
        float bmi = weight/(height*height);
        System.out.printf("%-20s%s", "bmi", "Interpretation");
        System.out.println("");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
