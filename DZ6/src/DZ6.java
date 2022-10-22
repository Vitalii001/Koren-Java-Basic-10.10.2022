public class DZ6 {
    public static void main(String[] args) {
        String team1 = "Terorist";
        int team1Player1Frags = 5;
        int team1Player2Frags = 8;
        int team1Player3Frags = 9;
        int team1Player4Frags = 6;
        int team1Player5Frags = 15;
        double team1AverageResult = ((team1Player1Frags + team1Player2Frags + team1Player3Frags + team1Player4Frags + team1Player5Frags) / 5.0);


        String team2 = "ContrTerorist";
        int team2Player1Frags = 7;
        int team2Player2Frags = 6;
        int team2Player3Frags = 4;
        int team2Player4Frags = 6;
        int team2Player5Frags = 25;
        double team2AverageResult = ((team2Player1Frags + team2Player2Frags + team2Player3Frags + team2Player4Frags + team2Player5Frags) / 5.0);

        String str;
        if (team1AverageResult == team2AverageResult){
            str = "Ничья, команды набрали по "+team1AverageResult+" очков";
            System.out.println(str);
        }
        else if (team1AverageResult > team2AverageResult) {
            str = "Победила команда " + team1 + " набравшая " + team1AverageResult + " очков";
        }else {
            str = "Победила команда " + team2 + " набравшая " + team2AverageResult + " очков";
        }
            System.out.println(str);
        }

}
