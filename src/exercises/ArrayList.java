package exercises;

public class ArrayList {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumlist(numbers);

    }

    public static void sumlist(int[] numbers) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count = count + numbers[i];
            }
        }

        System.out.println("The sum of all evens in the list is: " + count);
    }
}
