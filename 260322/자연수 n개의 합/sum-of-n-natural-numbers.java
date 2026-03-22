// 1부터 N까지의 자연수의 합이 S 이하인 경우 중 가능한 N의 최댓값
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        // logic
        long answer = 0L;
        long left = 1;
        long right = 100000;

        while(left <= right) {
            long mid = (left + right) / 2;

            if ((mid * (mid + 1)) / 2 <= S) {
                answer = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // output
        System.out.println(answer);
    }
}