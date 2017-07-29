package exercises;
import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {

        System.out.println(rectangle());

    }

    public static int rectangle() {

        Scanner length;

        length = new Scanner(System.in);
        System.out.println("Please enter the width of rectangle");
        int width = length.nextInt();
        System.out.println("Please enter the height of the rectangle");
        int height = length.nextInt();

        int area = width * height;
        System.out.println("Area of the rectangle you entered is: ");

        return area;




    }


}
