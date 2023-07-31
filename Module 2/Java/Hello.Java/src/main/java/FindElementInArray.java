import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"Đức","Huy","Vinh","Long"};
        System.out.printf("Nhập tên sinh viên cần tìm: ");
        String input_name = input.nextLine();
        for(int i = 0; i<arr.length; i++){
            if(input_name.equalsIgnoreCase(arr[i])){
                System.out.printf("Tìm thấy sinh viên %s tại vị trí thứ %s", input_name, i+1);
                break;
            }
        }
    }
}
