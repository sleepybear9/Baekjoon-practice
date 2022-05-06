import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int R = in.nextInt();
            String S = in.next();
            String[] p= S.split("");


            for (String token: p) {
                    System.out.print(token.repeat(R));
                }
            System.out.println("");
            }
    }
}
