import java.util.Scanner;

public class Stones_1236A {

    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        int[] ans = new int[t];
        sc.nextLine();
        
        for (int i = 0; i < t; i++) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            sc.nextLine();
            while(true) {
                if (b>0 && c>1) {
                    ans[i]+=3;
                    b--;
                    c-=2;
                }
                else if (a>0 && b>1) {
                    ans[i]+=3;
                    a--;
                    b-=2;
                }
                else {
                    break;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
