package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        printMilesPerGallon();

    }

    public static void printMilesPerGallon() {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        int miles = in.nextInt();
        System.out.println("How many gallons of gas did you use?");
        int gallons = in.nextInt();

        float mpg = miles / gallons;
        System.out.println("Your miles-per-gallon is: " + mpg);



    }
}
