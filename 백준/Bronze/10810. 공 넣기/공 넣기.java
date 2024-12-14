import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int basket = scan.nextInt();
        int time = scan.nextInt();
        int[] basketArr = new int[basket];
        for(int i = 0; i<basketArr.length; i++){
            basketArr[i]=0;
        }
        for(int i = 0; i<time; i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int num = scan.nextInt();
            for(int j = start; j<=end; j++){
                basketArr[j-1]=num;
            }
        }

        for(int a : basketArr){
            System.out.print(a+" ");
        }

        scan.close();
    }
}