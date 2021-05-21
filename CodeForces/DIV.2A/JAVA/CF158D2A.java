import java.util.Scanner;

public class NextRound_158A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int advanced = 0;
        int[] scores = new int[n];
        sc.nextLine();
        
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (scores[i] > 0 && scores[i] >= scores[k - 1]) {
                    advanced++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(advanced);
    }
}
