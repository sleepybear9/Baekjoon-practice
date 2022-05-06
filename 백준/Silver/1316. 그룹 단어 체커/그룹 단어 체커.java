import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        loop:
        for(int i = 0; i < num; i++) {
            String word = in.next();
            ArrayList<Character> check = new ArrayList<>();
            check.add(word.charAt(0));
            for(int m = 1; m < word.length(); m++) {
                char target = word.charAt(m);
                if(!check.contains(target)) {
                    check.add(target);
                } else if(check.contains(target) && (target != word.charAt(m - 1))) {
                    check = new ArrayList<>();
                    continue loop;
                }
            }
            count ++;
        }
        System.out.println(count);
    }
}