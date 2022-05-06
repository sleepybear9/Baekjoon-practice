import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        int time = 0;
        for(int i = 0; i < word.length(); i++) {
            char point = word.charAt(i);
            int asc = (int)point;

            if('A' <= asc && asc <= 'C') {
                time +=3;
            } else if('D' <= asc && asc <= 'F') {
                time +=4;
            } else if('G' <= asc && asc <= 'I') {
                time +=5;
            } else if('J' <= asc && asc <= 'L') {
                time +=6;
            } else if('M' <= asc && asc <= 'O') {
                time +=7;
            } else if('P' <= asc && asc <= 'S') {
                time +=8;
            } else if('T' <= asc && asc <= 'V') {
                time +=9;
            } else if('W' <= asc && asc <= 'Z') {
                time +=10;
            } else {
                time +=0;
            }

        }
        System.out.println(time);
    }
}
