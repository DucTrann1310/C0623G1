import java.util.Scanner;

public class Hello {
    public static Scanner abc = new Scanner(System.in);
    public static void main(String[] args) { //psvm
//        System.out.println("abcxyz");           //sout + ln (line
//        System.out.printf("hello");             //souf + f (format)
//        System.out.printf("Ho: %s Ten : %s","Quang","Dang");
//
//
//
//        int  a1 = 5;     //So nguyen: int - 4byte
//        long a2 = 6;     //So nguyen: long - 8 byte
//        byte a3 = 5;    //so nguyen: byte - 1byte
//
//        float f1 = 1.0f;    //số thực: 4 byte
//        double f2 = 1.0d;    //số thực: 8 byte
//
//        String s = "hello world";
//
//        boolean b1 = true;



//        System.out.println("Nhập vào 1 số: ");
//        int number = scanner.nextInt();
//        for(int i = number; i >= 0; i--){
//            System.out.println(i);
//        }


        System.out.println("Nhập vào 1 số:");
        int number = abc.nextInt();
        int i = 2;
        while (i <= number){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
