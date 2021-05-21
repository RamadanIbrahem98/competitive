import java.util.Scanner;

public class LuckyDivision_122A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int a = 0;

        int[] lucky = {4,7,44,47,77,74,444,447,477,474,744,777,774,747,744};

        for (int i = 0; i < lucky.length; i++) {
            if (n % lucky[i] == 0) {
                System.out.println("YES");
                break;
            }
            else{
                a++;
            }
        }
        if (a == lucky.length) {
            System.out.println("NO");
        }
    }
}

