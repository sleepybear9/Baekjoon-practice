import java.util.Scanner;

public class Main {
    static int value;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        value = in.nextInt();
        int count = 0;

        if( value < 100) {
            count = value;
        } else {
            count = 99;
            for (int i = 100; i <= value; i++) {
                int first = i % 10;
                int second = ((i-first) % 100)/10;
                int third = (i-first-second)/100;

                if((third-second)==(second-first)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
