import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long answer = 0;
        long left = 1;
        long right = S;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (mid * (mid + 1) / 2 <= S) {
                left = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}