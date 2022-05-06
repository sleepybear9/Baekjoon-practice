import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int th = in.nextInt();
        int stack = 0;
        int index = 0;

        for(int i = 1; stack < th; i ++) {
            stack += i;
            index = i;
        }

        int turn = th- stack + index;
        int son = 0;
        int mother = 0;
        int count = turn;

        if(index % 2 == 0) {
            son = 1;
            mother = index;

            for(int i = 1; i < count; i++) {
                son ++;
                mother --;
            }

        } else {
            son = index;
            mother = 1;

            for(int i = 1; i < count; i++) {
                son --;
                mother ++;
            }
        }

        System.out.println(son+"/"+mother);

    }
}

