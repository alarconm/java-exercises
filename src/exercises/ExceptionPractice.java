package exercises;

public class ExceptionPractice {

    public static void main (String[] args) {

        int[] list = {1,2,3,4,5};

        try {
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[6]);
            }

        } catch (Exception e) {
            System.out.println();

        } finally {
            System.out.println("Finished");

        }

    }
}
