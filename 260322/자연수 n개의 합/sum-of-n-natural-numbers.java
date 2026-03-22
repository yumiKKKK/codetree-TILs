import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long answer = 0;
        long left = 1;
        long right = S;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long sum; // overflow
            if (mid % 2 == 0) {
                sum = (mid / 2) * (mid + 1);
            } else {
                sum = mid * ((mid + 1) / 2);
            }

            if (sum <= S) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}