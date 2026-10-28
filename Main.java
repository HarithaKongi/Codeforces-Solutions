import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
            }

            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int x : a) {
                if (x == max) {
                    b.add(x);
                } else {
                    c.add(x);
                }
            }

            if (c.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());

                for (int x : b) {
                    System.out.print(x + " ");
                }
                System.out.println();

                for (int x : c) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
