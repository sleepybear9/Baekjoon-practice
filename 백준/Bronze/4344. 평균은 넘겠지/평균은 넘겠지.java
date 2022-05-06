import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trying = in.nextInt();

        for(int i=0; i<trying; i++) {
            int mother = in.nextInt();
            double[] sons = new double[mother];
            int sum = 0;

            for(int m = 0; m < mother; m++) {
                sons[m] = (double) in.nextInt();
                sum += sons[m];
            }
            double avg = sum/mother;

            int count = 0;
            for(double token: sons) {
                if(token > avg) {
                    count ++;;
                }
            }

            double value = (((double)count/mother)*100);
            System.out.printf("%.3f%%",value);
            System.out.println("");
        }

    }
}
