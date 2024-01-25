package _05_class._03_final;

import java.util.Scanner;
public class Final_Circle01 {

    //반지름 final 필드
    private final double radius;

    // PI 상수
    public static final double PI = 3.1415926535;

    public Final_Circle01(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * PI;
    }

    public void display() {
        System.out.println("원의 반지름 : " + this.radius);
        System.out.println("원의 넓이 : " + calculateArea());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        Final_Circle01 circle = new Final_Circle01(radius);
        circle.display();
        scanner.close();
    }

}