import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[31];



        for(int i = 0; i<28; i++){
            int input = scan.nextInt();
            num[input] = input;
        }

        for(int i = 1; i<=30; i++){
            if(num[i] == 0) {
                num[i] = i;
                System.out.println(num[i]);
            }
        }

        scan.close();
    }
}