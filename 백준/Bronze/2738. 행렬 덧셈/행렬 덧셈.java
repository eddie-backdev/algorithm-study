import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[][] hang1 = new int[N][M];
        int[][] hang2 = new int[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                hang1[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                hang2[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                hang1[i][j] += hang2[i][j];
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                System.out.print(hang1[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}