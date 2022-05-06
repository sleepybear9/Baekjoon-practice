import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            int asc = (int)(word.charAt(i));

            if ('A' <= asc && asc <= 'C') {
                time += 3;
            } else if (asc <= 'F') {
                time += 4;
            } else if (asc <= 'I') {
                time += 5;
            } else if (asc <= 'L') {
                time += 6;
            } else if (asc <= 'O') {
                time += 7;
            } else if (asc <= 'S') {
                time += 8;
            } else if (asc <= 'V') {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
