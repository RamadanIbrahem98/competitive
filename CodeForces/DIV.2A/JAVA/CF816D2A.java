import java.util.Scanner;

public class KarenAndMorning_816A {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String time = sc.nextLine();
        int[] a = new int[4];
        int ans = 0;
        char[] c = time.toCharArray();
        a[0] = Character.getNumericValue(c[0]);
        a[1] = Character.getNumericValue(c[1]);
        a[2] = Character.getNumericValue(c[3]);
        a[3] = Character.getNumericValue(c[4]);

        while ((a[0] != a[3]) || (a[1] != a[2])) {
            a[3]++;
            addition(a);
            ans++;
        }
        System.out.println(ans);
    }
    
    private static void addition(int[] a) {
        if (a[3] == 10) {
            a[2] += 1;
            a[3] = 0;
        }
        if (a[2] == 6) {
            a[1]++;
            a[2] = 0;
        }
        if (a[0] < 2) {
            if (a[1] == 10) {
                a[0]++;
                a[1] = 0;
            }
        }
        else if ((a[0] == 2)) {
            if(a[1] == 4) {
                a[0] = 0;
                a[1] = 0;
            }          
        }
    }
}
