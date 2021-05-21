import java.util.Scanner;

public class Vowels {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'|| word.charAt(i) == 'y') {
            } else {
                System.out.print("." + word.charAt(i));
            }
        }
    }
}