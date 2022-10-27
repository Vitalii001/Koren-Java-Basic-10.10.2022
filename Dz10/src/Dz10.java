import java.util.Arrays;
import java.util.Random;

public class Dz10 {

    public static void main(String[] args) {

        int[] initialNumbers = new int[7];
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            initialNumbers[i] = rand.nextInt(10);
        }
        Arrays.sort(initialNumbers);

        for (int i = 0; i < 7; i++) {
            System.out.print(initialNumbers[i]+"  ");
        }

        System.out.println();

        int[] playerNumbers = new int[7];
        Random rand1 = new Random();

        for (int i = 0; i < 7; i++) {
            playerNumbers[i] = rand1.nextInt(10);
        }
        Arrays.sort(playerNumbers);

        for (int i = 0; i < 7; i++) {
            System.out.print(playerNumbers[i]+"  ");
        }
        int coincidences =0;
        for (int i = 0; i < 7; i++){
            if (initialNumbers[i] == playerNumbers[i]){
                coincidences++;
            }
        }
        System.out.println();
        System.out.println("Количевство совпадени = " + coincidences);
    }
}
