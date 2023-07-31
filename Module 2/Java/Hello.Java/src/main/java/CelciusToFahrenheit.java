import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Celcius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celcius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Celcius: ");
                    celcius = input.nextDouble();
                    System.out.println("Celcius to Fahrenheit: " + CelciusToFahrenheit(celcius));
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println(("Fahrenheit to Celcius: " + FahrenheitToCelcius(fahrenheit)));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while(choice !=0);
    }
    public static double CelciusToFahrenheit(double celcius){
        double fahrenheit = (9.0 / 5)*celcius + 32;
        return fahrenheit;
    }
    public static double FahrenheitToCelcius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
