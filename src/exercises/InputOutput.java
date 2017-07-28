package exercises;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        helloWorld();

    }

    public static void helloWorld() {

        Scanner name;

        name = new Scanner(System.in);
        System.out.println("Please enter your name");
        String inputName = name.next();

        System.out.print("Hello " + inputName);

    }
}
