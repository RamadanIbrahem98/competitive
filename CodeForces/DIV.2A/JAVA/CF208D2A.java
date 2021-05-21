import java.util.Scanner;

public class WUB {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String wub = sc.nextLine();
        String[] word = wub.split("WUB");
        for(int i = 0; i < word.length; i++){
            if((word[i].isEmpty()) || (word[i] == null)) {
            }
            else
            {
                System.out.print(word[i] + " ");
            }
        }
    }
}