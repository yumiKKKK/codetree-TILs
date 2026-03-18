import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (((arr[i] & arr[j]) == 0) && ((arr[i] & arr[k]) == 0) && ((arr[j] & arr[k]) == 0)) {
                        if (result < arr[i] + arr[j] + arr[k])
                            result = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }

        System.out.println(result);
    }
}