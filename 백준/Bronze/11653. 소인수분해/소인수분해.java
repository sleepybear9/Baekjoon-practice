import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        if(a == 1) {
            return;
        }

        int b = 2;

        while (true) {
            if(a == 1) {
                break;
            } else if(a % b == 0){
                list.add(b);
                a = a/b;
            } else {
                b++;
            }
        }

        for(int k : list) {
            System.out.println(k);
        }

    }
}

