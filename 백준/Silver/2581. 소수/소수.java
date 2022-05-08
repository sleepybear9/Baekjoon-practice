import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lower = in.nextInt();
        int upper =in.nextInt();
        int sum = 0;
        int min = upper+1;

        loop:
        for (int i = lower; i <= upper; i++) {
            for(int n = 1; n < i; n++) {
                if (((i % n) == 0) && (n !=1)) {
                    continue loop;
                } else if(n != 1) {

                }
            }
            if(i != 1) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

