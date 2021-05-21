import java.util.Scanner;

public class ChatRoom_58A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = sc.nextLine();
        int i = 0;
        int j = 0;

        if(s.length() < 5) {
            System.out.println("NO");
        } else {
            for (char c : s.toCharArray()) {
                if (c == 'h' && i == 0) {
                    i++;
                }
                else if (c == 'e' && i == 1) {
                    i++;
                }
                else if ((c == 'l' && i == 2) || (c == 'l' && j == 1)) {
                    i++;
                    j++;
                }

                else if (c == 'o' && j == 2) {
                    i++;
                    j++;
                }
            }

            if (i == 5 && j == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

