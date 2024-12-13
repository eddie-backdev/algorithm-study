import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[9];
        int index = 1;
        for (int i = 0; i<a.length; i++){
            a[i]=scan.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int j = 1; j<a.length; j++){
            if(max<a[j]) {
                max = a[j];
                index = j+1;
            }
        }

        System.out.println(max);
        System.out.print(index);

        scan.close();
    }
}