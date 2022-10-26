import java.util.Random;
import java.util.Scanner;

public class Dz9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i1 = rand.nextInt(11);
        System.out.println("Давай сыграем в игру 'Угадай число' ");
        Scanner in = new Scanner(System.in);
        System.out.println("Попытка №1");
        System.out.print("Введите число от 0 до 10 : ");
        int num = in.nextInt();
        if (i1 == num) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали , попробуте снова!");
            System.out.println("_______________________________");
            Scanner in1 = new Scanner(System.in);
            System.out.println("Попытка №2");
            System.out.print("Введите число 0 до 10 : ");
            int num1 = in1.nextInt();
            if (num1 == i1) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали , попробуте снова!");
                System.out.println("_______________________________");
                Scanner in2 = new Scanner(System.in);
                System.out.println("Попытка №3");
                System.out.print("Введите число 0 до 10 : ");
                int num2 = in2.nextInt();
                if (num2 == i1) {
                    System.out.println("Вы угадали!");
                } else {
                    System.out.println("Вы проиграли!");
                }
            }
        }
    }
}