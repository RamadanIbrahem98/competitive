import java.util.Scanner;

public class Bitpp_282A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        sc.nextLine();
        int ans = 0;
        String[] in = new String[n];
        
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextLine();
            if (in[i].equals("++X") || in[i].equals("X++")){
                ans++;
            } else if (in[i].equals("--X") || in[i].equals("X--")) {
                ans--;
            }
        }
        System.out.println(ans);   
    }
}
