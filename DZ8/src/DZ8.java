public class DZ8 {
    public static void main(String[] args) {

        int[] agePlayersTeam1 = new int[]{23, 24, 25, 26, 32, 34, 23, 24, 34, 18, 26, 26, 24, 25, 27, 37, 35, 37, 35, 26, 23, 23, 34, 26, 27};

        int[] agePlayersTeam2 = new int[]{24, 24, 22, 23, 25, 21, 18, 34, 32, 31, 37, 36, 38, 36, 38, 36, 25, 26, 24, 23, 33, 25, 26, 23, 38,};

        System.out.println("Возраст игроков команды №1");
        for (int i = 0; i < agePlayersTeam1.length; i++) {
            System.out.print(agePlayersTeam1[i] + ", ");
        }

        System.out.println();
        System.out.println("Возраст игроков команды №2");
        for (int i = 0; i < agePlayersTeam2.length; i++) {
            System.out.print(agePlayersTeam2[i] + ", ");
        }
        System.out.println();
        double averageAgeTeam1 = 0;
            if (agePlayersTeam1.length > 0) {
                double sum = 0;
                for (int j = 0; j < agePlayersTeam1.length; j++) {
                    sum += agePlayersTeam1[j];
                }
                averageAgeTeam1 = sum / agePlayersTeam1.length;
                System.out.println("Средний возраст команды №1 = " + averageAgeTeam1);
            }

                double averageAgeTeam2 = 0;
                if (agePlayersTeam2.length > 0) {
                    double sum2 = 0;
                    for (int j = 0; j < agePlayersTeam2.length; j++) {
                        sum2 += agePlayersTeam2[j];
                    }
                    averageAgeTeam2 = sum2 / agePlayersTeam2.length;
                    System.out.println("Средний возраст команды №2 = " +averageAgeTeam2);
            }

    }
}
