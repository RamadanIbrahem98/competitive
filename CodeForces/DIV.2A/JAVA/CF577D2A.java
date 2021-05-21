import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(final String[] args) {
        final int n = sc.nextInt();
        final int x = sc.nextInt();
        int ans = 0;

        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n; j++) {
                if((x/i<=n)&&(x%i==0)) {
                    ans++;
                }
//                else if (i > x && j > x) {
//                    break;
//                }
//            }
        }

        // int[][] table = new int[n][n];

        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n; j++) {
        //         table[i-1][j-1] = i * j;
        //     }
        // }

        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n; j++) {
        //         if (x == table[i-1][j-1]) {
        //             ans++;
        //         }
        //     }
        // }


        System.out.println(ans);
    }
}