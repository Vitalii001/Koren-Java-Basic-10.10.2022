import java.util.Random;
import java.util.Scanner;

public class Dz9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i1 = rand.nextInt(11);
        int attempts = 5; //количество попыток
        int attemptCounter = 1;
        System.out.println("Давай сыграем в игру 'Угадай число' ");

        for (int i = 0; i < attempts; i++) {

            Scanner in = new Scanner(System.in);
            System.out.println("Попытка номер: " + attemptCounter);
            System.out.print("Введите число от 0 до 10 : ");
            attemptCounter++;
            int num = in.nextInt();
            if (i1 == num) {
                System.out.println("Вы угадали!");
                return;
            } else {
                if (attemptCounter == attempts + 1) {
                    System.out.println("Вы проиграли!");
                } else {
                    System.out.println("Вы не угадали , попробуте снова!");
                    System.out.println("_______________________________");
                }

            }
        }
    }
}
