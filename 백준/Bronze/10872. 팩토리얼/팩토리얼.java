import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int result = cycle(k);
        System.out.println(result);
    }

    public static int cycle(int a) {
        if(a == 0) {
            return 1;
        }
        return a*cycle(a-1);
    }
}

