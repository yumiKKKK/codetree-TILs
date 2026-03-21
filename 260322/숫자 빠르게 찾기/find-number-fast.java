import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            System.out.println(binarySearch(arr, x));
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int idx = -1;

        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int mid = (l + r) / 2;
            
            if (arr[mid] == x) 
                return mid + 1;
            else if (arr[mid] > x) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return idx;
    }
}