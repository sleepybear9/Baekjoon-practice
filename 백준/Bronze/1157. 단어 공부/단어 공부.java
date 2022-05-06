import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next().toUpperCase();

        int[] alpha= new int[26];

        for(int i = 0; i < input.length(); i++) {
            alpha[(input.charAt(i)-'A')]++;
        }

        int max = 0;
        char ans='?';

        for (int i = 0; i < alpha.length; i++) {
            if(max < alpha[i]) {
                max = alpha[i];
                ans = (char)(i + 'A');
            } else if(max == alpha[i]) {
                ans = '?';
            }
        }

        System.out.println(ans);

    }
}