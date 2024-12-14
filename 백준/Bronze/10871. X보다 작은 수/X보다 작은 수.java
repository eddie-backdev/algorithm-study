import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int match = scan.nextInt();
        int[] a = new int[length];
        for (int i = 0; i<length; i++){
            a[i]=scan.nextInt();
        }

        for(int get : a){
            if(get < match) System.out.print(get+" ");;
        }

        scan.close();
    }
}