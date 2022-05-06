import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int min = in.nextInt();
        int dur = in.nextInt();
        while (min+dur >= 60) {
            hour++;
            min-=60;
        }

        if(hour >= 24) {
            hour -=24;
        }

        System.out.println(hour+" "+(min+dur));
    }
}
