import java.util.Scanner;
import java.util.Random;
public class Dz11 {
    public static void main(String[] args) {
        System.out.println("Создайте масив");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количевство строчек : ");
        int a1 = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите количевство колонок : ");
        int b1 = in1.nextInt();

        int[][] array = new int[a1][b1];
        Random rand = new Random();

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b1; j++)
                array[i][j] = rand.nextInt(a1 * b1);
        }
        System.out.println("Начальная матрица");

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] trans_arr = new int[b1][a1];
        for (int i = 0; i < a1;i++){
            for (int j = 0; j < b1;j++) {
                trans_arr[j][i] = array[i][j];
            }
        }
        System.out.println("Транспонированая матрица");
        for (int i = 0; i < b1;i++) {
            for (int j = 0; j < a1; j++) {
                System.out.print(trans_arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
