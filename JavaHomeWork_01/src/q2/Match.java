package q2;


public class Match {
    private String team1;
    private String team2;
    private Counter score1;
    private Counter score2;


    public Match(String t1, String t2) {
        this.team1 = t1;
        this.team2 = t2;
        score1 = new Counter(0);
        score2 = new Counter(0);
    }


    public void team1_score() {
        score1.increment();
    }

    public void team2_score() {
        score2.increment();
    }


    public void print_score() {
        System.out.println("\nScore:");
        System.out.println("" + team1 + "\t" + team2);
        System.out.println(" " +
                "" + score1.read_value() + "\t " + score2.read_value());
    }


    public int readTeam1Score() {
        return score1.read_value();
    }

    public int readTeam2Score() {
        return score2.read_value();
    }

    public String readTeam1Name() {
        return team1;
    }

    public String readTeam2Name() {
        return team2;
    }

}
