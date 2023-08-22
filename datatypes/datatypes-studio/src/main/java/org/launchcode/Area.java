package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextInt();
        input.close();

        //area = radius * radius * 3.14;
        area = Circle.getArea(radius);
        System.out.println("The area of your circle is " + area);
    }
}
