import java.util.Scanner;

public class HQ9_133A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String query = sc.nextLine();
        int x = 0;
        
        for (char c : query.toCharArray()) {
            if (c == 72 || c == 81 || c == 57 ) {
                x++;
            }
        }
        if (x > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
