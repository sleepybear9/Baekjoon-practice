import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine().trim();
        String[] count = sentence.split(" ");

        int len = count.length;

        if(count[0] == "") {
            len--;
        }
        if(count[0] == null) {
            len = 0;
        }
        System.out.println(len);
    }
}