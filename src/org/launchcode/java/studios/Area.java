package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a radius");
        Double radius = in.nextDouble();

        while (radius < 0 ) {
            System.out.println("Please enter a positive number");
            radius = in.nextDouble();
        }

        Double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);

    }
}
