import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> line = new ArrayList<>();

        line.add(in.nextInt());
        line.add(in.nextInt());
        line.add(in.nextInt());

        while (line.get(0) != 0) {

            int max = line.get(0);
            if (max < line.get(1)) {
                max = line.get(1);
            }
            if (max < line.get(2)) {
                max = line.get(2);
            }
            line.remove(line.indexOf(max));

            if ((max * max) == (line.get(0) * line.get(0)) + (line.get(1) * line.get(1))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

            line = new ArrayList<>();
            line.add(in.nextInt());
            line.add(in.nextInt());
            line.add(in.nextInt());
        }
    }

}
