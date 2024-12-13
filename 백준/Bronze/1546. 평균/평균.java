import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();

        double[] score = new double[cnt];

        for(int i = 0; i<cnt; i++){
            score[i] = scan.nextDouble();
        }

        Arrays.sort(score);

        double max = score[score.length-1];

        for(int i = 0; i<cnt; i++){
            score[i] = (score[i]/max)*100;
        }

        double total = 0;

        for(int i = 0; i<cnt; i++){
            total += score[i];
        }

        System.out.println(total/cnt);
        scan.close();
    }
}