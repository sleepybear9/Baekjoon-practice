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
            return 0;
        }
        if(a == 1) {
            return 1;
        }
        return cycle(a-1)+cycle(a-2);
    }
}
