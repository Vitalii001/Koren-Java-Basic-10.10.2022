public class DZ7shuttles {
    public static void main(String[] args) {
        int numbers = 100; // Количество шатлов которое нужно прономеровать
        System.out.println("Шатлы можно номеровать так:");
        int i =0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (a != 4 && a != 9 && b != 4 && b != 9 && c != 4 && c != 9) {
                        int k = a * 100 + b * 10 + c;
                        if (i<numbers && k !=0){
                            System.out.println(k);
                            i = i+1;
                        }
                    }

                }
            }

        }
    }
}





