import java.util.Scanner;

public class DominoPiling_50A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int M = sc.nextInt();
        int N = sc.nextInt();
        int ans = (M*N)/2;
        System.out.println(ans);
    }
}

