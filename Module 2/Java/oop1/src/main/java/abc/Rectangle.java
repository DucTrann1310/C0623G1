package abc;

import java.util.Scanner;

public class Rectangle {
  public   double width, height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPrimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "width = " + width + ", height = " + height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = input.nextDouble();

        System.out.println("Enter height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Rectangle: " + rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Primeter: " + rectangle.getPrimeter());
    }
}
