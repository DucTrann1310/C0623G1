import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Dictionary;
import java.util.Scanner;

public class QuadraticEquation {
    int a;
    int b;
    int c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        if(getDiscriminant()<0){
            return Double.NaN;
        }else {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
    public double getRoot2(){
        if(getDiscriminant()<0){
            return Double.NaN;
        }else {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = input.nextInt();
        System.out.println("Nhập b = ");
        int b = input.nextInt();
        System.out.println("Nhập c = ");
        int c = input.nextInt();

        QuadraticEquation newQuadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Discriminant: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Discriminant: " + a + "x^2 + " + b + "x + " + c + " = 0" );
        System.out.println("Root1: " + newQuadraticEquation.getRoot1());
        System.out.println("Root2: " + newQuadraticEquation.getRoot2());
    }
}
