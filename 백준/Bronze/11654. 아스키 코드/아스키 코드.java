import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char asc = text.charAt(0);

        int code = (int) asc;
        System.out.println(code);
    }
}