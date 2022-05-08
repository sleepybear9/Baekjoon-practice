import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = num;

        for(int i = 1; i <= num; i++) {
            int target = in.nextInt();
            if(target == 1) {
                count--;
            }
            for(int n = 2; n < target; n++) {
                if(((double)target % n) == 0.0) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

