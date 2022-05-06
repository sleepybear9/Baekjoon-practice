import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int origin = in.nextInt();
        int change = origin;

        while(true) {
            int a = change/10;
            int b = change%10;
            int sum = a+b;

            change = (b*10) + (sum%10);
            count++;
            if(origin == change) {
                break;
            }
        }

        System.out.println(count);
    }
}
