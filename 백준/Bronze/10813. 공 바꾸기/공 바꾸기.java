import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int basket = scan.nextInt();
        int time = scan.nextInt();
        int temp = 0;
        int[] basketArr = new int[basket];
        for(int i = 0; i<basketArr.length; i++){
            basketArr[i]=i+1;
        }
        for(int i = 0; i<time; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            temp = basketArr[first-1];
            basketArr[first-1]=basketArr[second-1];
            basketArr[second-1]=temp;
        }

        for(int a : basketArr){
            System.out.print(a+" ");
        }

        scan.close();
    }
}