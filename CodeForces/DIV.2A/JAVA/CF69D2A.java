import java.util.Scanner;

public class YoungPhysicist_69A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        sc.nextLine();

        int[] ans = new int[3];

        int[][] a = new int [n][3];

        boolean flag = true;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                ans[i] += a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (ans[i] != 0) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

