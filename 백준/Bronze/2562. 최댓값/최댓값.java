import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[9];

        for(int i = 0; i < 9; i++) {
           list[i] = in.nextInt();
       }
        int flag = 0;

        for(int i = 1; i < list.length; i++) {
            if(list[flag] < list[i]) {
                flag = i;
            }
        }

        System.out.println(list[flag]);
        System.out.println(flag+1);
    }
}
