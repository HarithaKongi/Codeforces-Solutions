import java.util.*;

public class CRaspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int even = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even++;
                }
            }

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] % k == 0) {
                    ans = 0;
                    break;
                } else {
                    ans = Math.min(ans, k - arr[i] % k);
                }
            }

            if (k == 4) {
                if (even >= 2) {
                    ans = 0;
                } else if (even == 1) {
                    ans = Math.min(ans, 1);
                } else {
                    ans = Math.min(ans, 2);
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
