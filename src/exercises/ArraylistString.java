package exercises;

public class ArraylistString {

    public static void main(String[] args) {

        String[] ipsum = {"Cray", "o", "fiver", "oh", "anothe", "55555", "foiuoupqowieurpio"};

        wordCount(ipsum);
    }

    public static void wordCount(String[] ipsum) {

        for (String word : ipsum) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
