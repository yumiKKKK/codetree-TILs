import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int S = 0;

        for(int i = 0; i < q; i++) {
            String op = sc.next();
            if (op.equals("clear")) {
                S = 0;
            }
            else {
                int x = sc.nextInt();
                if (op.equals("add")) {
                    S |= (1 << x);
                }
                else if (op.equals("delete")) {
                    S &= ~(1 << x);
                }
                else if (op.equals("print")) {
                    if (((S >> x) & 1) == 1)
                        System.out.println(1);
                    else 
                        System.out.println(0);
                }
                else { // toggle
                    S = S ^ (1 << x);
                }
            }
        }
    }
}